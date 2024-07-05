package org.apache.fury.builder;

import org.apache.fury.Fury;
import org.apache.fury.memory.MemoryBuffer;
import org.apache.fury.resolver.NoRefResolver;
import org.apache.fury.memory.Platform;
import org.apache.fury.resolver.ClassInfo;
import org.apache.fury.resolver.ClassInfoHolder;
import org.apache.fury.resolver.ClassResolver;
import org.apache.fury.builder.Generated;
import org.apache.fury.serializer.CodegenSerializer.LazyInitBeanSerializer;
import org.apache.fury.serializer.EnumSerializer;
import org.apache.fury.serializer.Serializer;
import org.apache.fury.serializer.StringSerializer;
import org.apache.fury.serializer.ObjectSerializer;
import org.apache.fury.serializer.CompatibleSerializer;
import org.apache.fury.serializer.collection.AbstractCollectionSerializer;
import org.apache.fury.serializer.collection.AbstractMapSerializer;
import org.apache.fury.builder.Generated.GeneratedCompatibleSerializer;

public final class SomeClassAFuryCompatibleCodec_1 extends Generated.GeneratedSerializer {

  private final NoRefResolver refResolver;
  private final ClassResolver classResolver;
  private final StringSerializer strSerializer;
  private final org.apache.fury.resolver.FieldResolver fieldResolver;
  private Fury fury;

  public SomeClassAFuryCompatibleCodec_1(Fury fury, Class classType) {
      super(fury, classType);
      this.fury = fury;
      fury.getClassResolver().setSerializerIfAbsent(classType, this);

      org.apache.fury.resolver.RefResolver refResolver0 = fury.getRefResolver();
      refResolver = ((NoRefResolver)refResolver0);
      classResolver = fury.getClassResolver();
      strSerializer = fury.getStringSerializer();
      fieldResolver = classResolver.getFieldResolver(SomeClassA.class);
  }

  private void writeEmbedTypes4Fields(SomeClassA someClassA1, MemoryBuffer memoryBuffer) {
      memoryBuffer.writeInt32(14681); // filed v
      Object object1 = Platform.getObject(someClassA1, 16L);
      String v = (String)object1;
      if ((v == null)) {
          memoryBuffer.writeByte(((byte)-3));
      } else {
          memoryBuffer.writeByte(((byte)0));
          StringSerializer.writeBytesString(memoryBuffer, v);
      }
      memoryBuffer.writeInt32(15141);
      int value12 = Platform.getInt(someClassA1, 12L);
      memoryBuffer.writeVarInt32(value12);
  }

  // old SomeClassA(v = "hi", x = 1000, z=false) // bytes
  // old SomeClassA(v = "hi", z = false, x = 1000) // bytes
    // new SomeClassA(x, v)
  private long readEmbedTypes4Fields(SomeClassA someClassA2, MemoryBuffer memoryBuffer1, long value0) {
      org.apache.fury.resolver.FieldResolver fieldResolver = this.fieldResolver;
      StringSerializer strSerializer = this.strSerializer; // 字段类型
      if ((value0 == 14681L)) { // 字段名
          if ((memoryBuffer1.readByte() != ((byte)-3))) {
              String string = strSerializer.readBytesString(memoryBuffer1);
              Platform.putObject(someClassA2, 16L, string);
          } else {
              Platform.putObject(someClassA2, 16L, null);
          }
          value0 = memoryBuffer1._readInt32OnLE();
      } else {
          while ((((value0 & 3L) == ((byte)1)) && (value0 < 14681L))) {
            if ((fieldResolver.skipDataBy4(memoryBuffer1, ((int)value0)) == 9223372036854775806L)) {
                return 9223372036854775806L;
            }
            value0 = memoryBuffer1._readInt32OnLE();
          }
          if ((value0 == 14681L)) {
              if ((memoryBuffer1.readByte() != ((byte)-3))) {
                  String string1 = strSerializer.readBytesString(memoryBuffer1);
                  Platform.putObject(someClassA2, 16L, string1);
              } else {
                  Platform.putObject(someClassA2, 16L, null);
              }
              value0 = memoryBuffer1._readInt32OnLE();
          }
      }
      if ((value0 == 15141L)) {
          int value6 = memoryBuffer1._readVarInt32OnLE();
          Platform.putInt(someClassA2, 12L, value6);
          value0 = memoryBuffer1._readInt32OnLE();
      } else {
          while ((((value0 & 3L) == ((byte)1)) && (value0 < 15141L))) {
            if ((fieldResolver.skipDataBy4(memoryBuffer1, ((int)value0)) == 9223372036854775806L)) {
                return 9223372036854775806L;
            }
            value0 = memoryBuffer1._readInt32OnLE();
          }
          if ((value0 == 15141L)) {
              int value8 = memoryBuffer1._readVarInt32OnLE();
              Platform.putInt(someClassA2, 12L, value8);
              value0 = memoryBuffer1._readInt32OnLE();
          }
      }
      return value0;
  }

  @Override public final void write(MemoryBuffer buffer, Object obj) {
      SomeClassA someClassA3 = (SomeClassA)obj;
      this.writeEmbedTypes4Fields(someClassA3, buffer);
      buffer.writeInt64(9223372036854775806L);
  }

  @Override public final Object read(MemoryBuffer buffer) {
      org.apache.fury.resolver.FieldResolver fieldResolver = this.fieldResolver;
      Object instance = Platform.newInstance(SomeClassA.class);
      SomeClassA someClassA4 = (SomeClassA)instance;
      refResolver.reference(someClassA4);
      long partFieldInfo = buffer._readInt32OnLE();
      while ((((partFieldInfo & 3L) == ((byte)1)) && (partFieldInfo < 14681L))) {
        if ((fieldResolver.skipDataBy4(buffer, ((int)partFieldInfo)) == 9223372036854775806L)) {
            return someClassA4;
        }
        partFieldInfo = buffer._readInt32OnLE();
      }
      partFieldInfo = this.readEmbedTypes4Fields(someClassA4, buffer, partFieldInfo);
      if ((partFieldInfo == 9223372036854775806L)) {
          return someClassA4;
      }
      while (((partFieldInfo & 3L) == ((byte)1))) {
        if ((fieldResolver.skipDataBy4(buffer, ((int)partFieldInfo)) == 9223372036854775806L)) {
            return someClassA4;
        }
        partFieldInfo = buffer._readInt32OnLE();
      }
      long value10 = buffer._readInt32OnLE();
      partFieldInfo = ((value10 << 32) | (partFieldInfo & 4294967295L));
      while (((partFieldInfo & 7L) == ((byte)3))) {
        if ((fieldResolver.skipDataBy8(buffer, partFieldInfo) == 9223372036854775806L)) {
            return someClassA4;
        }
        partFieldInfo = buffer._readInt64OnLE();
      }
      while (((partFieldInfo & 7L) == ((byte)7))) {
        if ((fieldResolver.skipDataBy8(buffer, partFieldInfo) == 9223372036854775806L)) {
            return someClassA4;
        }
        partFieldInfo = buffer._readInt64OnLE();
      }
      fieldResolver.skipEndFields(buffer, partFieldInfo);
      return someClassA4;
  }

}
