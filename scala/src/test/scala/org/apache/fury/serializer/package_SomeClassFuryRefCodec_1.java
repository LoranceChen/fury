package org.apache.fury.serializer;

import org.apache.fury.Fury;
import org.apache.fury.memory.MemoryBuffer;
import org.apache.fury.resolver.MapRefResolver;
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
import org.apache.fury.builder.Generated.GeneratedObjectSerializer;

public final class package_SomeClassFuryRefCodec_1 extends GeneratedObjectSerializer {

  private final MapRefResolver refResolver;
  private final ClassResolver classResolver;
  private final StringSerializer strSerializer;
  private Fury fury;

  public package_SomeClassFuryRefCodec_1(Fury fury, Class classType) {
      super(fury, classType);
      this.fury = fury;
      fury.getClassResolver().setSerializerIfAbsent(classType, this);

      org.apache.fury.resolver.RefResolver refResolver0 = fury.getRefResolver();
      refResolver = ((MapRefResolver)refResolver0);
      classResolver = fury.getClassResolver();
      strSerializer = fury.getStringSerializer();
  }

  @Override public final void write(MemoryBuffer buffer, Object obj) {
      buffer.grow(8);
      byte[] base = buffer.getHeapMemory();
      buffer._unsafeWriteVarInt32(Platform.getInt(obj, 12L));
  }

  @Override public final Object read(MemoryBuffer buffer) {
      Object object10 = Platform.newInstance(super.type);
      refResolver.reference(object10);
      byte[] heapBuffer = buffer.getHeapMemory();
      Platform.putInt(object10, 12L, buffer._readVarInt32OnLE());
      return object10;
  }

}
