package org.apache.fury.builder
import org.apache.fury.Fury
import org.apache.fury.config.{CompatibleMode, Language}
import org.apache.fury.memory.MemoryBuffer
import org.apache.fury.serializer.{PkgObjectMain, PkgObjectMain2, SomePackageObject}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import java.nio.ByteBuffer

class CodecUtilsTest extends AnyWordSpec with Matchers {
  "builder debug test" in {
    val fury = Fury.builder()
      .withLanguage(Language.JAVA)
      .withCompatibleMode(CompatibleMode.COMPATIBLE)
      .withRefTracking(true)
      .withScalaOptimizationEnabled(true)
      .requireClassRegistration(false).build()

    val p = SomePackageObject.SomeClass(1)
    val binary = fury.serialize(p)
    fury.deserialize(binary) shouldEqual p
  }

  "generate class serializer" in {
    val fury  = Fury.builder.withLanguage(Language.JAVA)
      .withCompatibleMode(CompatibleMode.COMPATIBLE)
      .withRefTracking(false).requireClassRegistration(false).build
    val seqCodecClass  = fury.getClassResolver.getSerializerClass(classOf[SomeClassA])
    val seqCodecClass2  = fury.getClassResolver.getSerializerClass(classOf[SomeClassB])
    val seqCodecClass3  = fury.getClassResolver.getSerializerClass(classOf[SomeClassC])
    val serializer1  = seqCodecClass.asSubclass(classOf[Generated.GeneratedSerializer]).getConstructor(classOf[Fury], classOf[Class[_]]).newInstance(fury, classOf[SomeClassA])
    val serializer2  = seqCodecClass.asSubclass(classOf[Generated.GeneratedSerializer]).getConstructor(classOf[Fury], classOf[Class[_]]).newInstance(fury, classOf[SomeClassB])
    val serializer3  = seqCodecClass.asSubclass(classOf[Generated.GeneratedSerializer]).getConstructor(classOf[Fury], classOf[Class[_]]).newInstance(fury, classOf[SomeClassC])
    serializer1
  }

  "codec with generated code" in {
    val fury  = Fury.builder.withLanguage(Language.JAVA)
      .withCompatibleMode(CompatibleMode.COMPATIBLE)
      .withRefTracking(false).requireClassRegistration(false).build
    val serializer = new SomeClassAFuryCompatibleCodec_1(fury, classOf[SomeClassA])
    val someClassA = SomeClassA("hello world", 10)
    val byteArray = ByteBuffer.allocate(1000)//new Array[Byte](1000)
    val buffer = MemoryBuffer.fromByteBuffer(byteArray)
    serializer.write(buffer, SomeClassA("hello world", 10))
    val decodeObj = serializer.read(buffer)
    decodeObj
  }

  "codec with generated code2" in {
    val fury  = Fury.builder.withLanguage(Language.JAVA)
      .withCompatibleMode(CompatibleMode.COMPATIBLE)
      .withRefTracking(false).requireClassRegistration(false).build
    val serializerb = new SomeClassBFuryCompatibleCodec_1(fury, classOf[SomeClassB])
    val serializerc = new SomeClassCFuryCompatibleCodec_1(fury, classOf[SomeClassC])
    val someClassB = SomeClassB("hello world", 10, true)
    val byteArray = ByteBuffer.allocate(1000)//new Array[Byte](1000)
    val buffer = MemoryBuffer.fromByteBuffer(byteArray)
    serializerb.write(buffer, someClassB)
    val decodeObj = serializerc.read(buffer)
    decodeObj
  }
}


