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

public final class SomeClassCFuryCompatibleCodec_1 extends Generated.GeneratedSerializer {

  private final NoRefResolver refResolver;
  private final ClassResolver classResolver;
  private final StringSerializer strSerializer;
  private final org.apache.fury.resolver.FieldResolver fieldResolver;
  private Fury fury;

  public SomeClassCFuryCompatibleCodec_1(Fury fury, Class classType) {
      super(fury, classType);
      this.fury = fury;
      fury.getClassResolver().setSerializerIfAbsent(classType, this);

      org.apache.fury.resolver.RefResolver refResolver0 = fury.getRefResolver();
      refResolver = ((NoRefResolver)refResolver0);
      classResolver = fury.getClassResolver();
      strSerializer = fury.getStringSerializer();
      fieldResolver = classResolver.getFieldResolver(SomeClassC.class);
  }

  private void writeEmbedTypes4Fields(MemoryBuffer memoryBuffer, SomeClassC someClassC1) {
      memoryBuffer.writeInt32(15193);
      Object object1 = Platform.getObject(someClassC1, 20L);
      String x = (String)object1;
      if ((x == null)) {
          memoryBuffer.writeByte(((byte)-3));
      } else {
          memoryBuffer.writeByte(((byte)0));
          StringSerializer.writeBytesString(memoryBuffer, x);
      }
      memoryBuffer.writeInt32(15397);
      int value12 = Platform.getInt(someClassC1, 12L);
      memoryBuffer.writeVarInt32(value12);
      memoryBuffer.writeInt32(15637);
      boolean value23 = Platform.getBoolean(someClassC1, 16L);
      memoryBuffer.writeBoolean(value23);
  }

  private long readEmbedTypes4Fields(SomeClassC someClassC2, MemoryBuffer memoryBuffer1, long value0) {
      StringSerializer strSerializer = this.strSerializer;
      org.apache.fury.resolver.FieldResolver fieldResolver = this.fieldResolver;
      if ((value0 == 15193L)) {
          if ((memoryBuffer1.readByte() != ((byte)-3))) {
              String string = strSerializer.readBytesString(memoryBuffer1);
              Platform.putObject(someClassC2, 20L, string);
          } else {
              Platform.putObject(someClassC2, 20L, null);
          }
          value0 = memoryBuffer1._readInt32OnLE();
      } else {
          // 当前内存中Class是否存在默认值？
          // true - 赋值默认值
          // false - xxx below
          while ((((value0 & 3L) == ((byte)1)) && (value0 < 15193L))) {
            if ((fieldResolver.skipDataBy4(memoryBuffer1, ((int)value0)) == 9223372036854775806L)) {
                return 9223372036854775806L;
            }
            value0 = memoryBuffer1._readInt32OnLE();
          }
          if ((value0 == 15193L)) {
              if ((memoryBuffer1.readByte() != ((byte)-3))) {
                  String string1 = strSerializer.readBytesString(memoryBuffer1);
                  Platform.putObject(someClassC2, 20L, string1);
              } else {
                  Platform.putObject(someClassC2, 20L, null);
              }
              value0 = memoryBuffer1._readInt32OnLE();
          }
      }
      if ((value0 == 15397L)) {
          int value7 = memoryBuffer1._readVarInt32OnLE();
          Platform.putInt(someClassC2, 12L, value7);
          value0 = memoryBuffer1._readInt32OnLE();
      } else {
          while ((((value0 & 3L) == ((byte)1)) && (value0 < 15397L))) {
            if ((fieldResolver.skipDataBy4(memoryBuffer1, ((int)value0)) == 9223372036854775806L)) {
                return 9223372036854775806L;
            }
            value0 = memoryBuffer1._readInt32OnLE();
          }
          if ((value0 == 15397L)) {
              int value9 = memoryBuffer1._readVarInt32OnLE();
              Platform.putInt(someClassC2, 12L, value9);
              value0 = memoryBuffer1._readInt32OnLE();
          }
      }
      if ((value0 == 15637L)) {
          boolean value11 = memoryBuffer1.readBoolean();
          Platform.putBoolean(someClassC2, 16L, value11);
          value0 = memoryBuffer1._readInt32OnLE();
      } else {
          while ((((value0 & 3L) == ((byte)1)) && (value0 < 15637L))) {
            if ((fieldResolver.skipDataBy4(memoryBuffer1, ((int)value0)) == 9223372036854775806L)) {
                return 9223372036854775806L;
            }
            value0 = memoryBuffer1._readInt32OnLE();
          }
          if ((value0 == 15637L)) {
              boolean value14 = memoryBuffer1.readBoolean();
              Platform.putBoolean(someClassC2, 16L, value14);
              value0 = memoryBuffer1._readInt32OnLE();
          }
      }
      return value0;
  }

  @Override public final void write(MemoryBuffer buffer, Object obj) {
      SomeClassC someClassC3 = (SomeClassC)obj;
      this.writeEmbedTypes4Fields(buffer, someClassC3);
      buffer.writeInt64(9223372036854775806L);
  }

  @Override public final Object read(MemoryBuffer buffer) {
      org.apache.fury.resolver.FieldResolver fieldResolver = this.fieldResolver;
      Object instance = Platform.newInstance(SomeClassC.class);
      SomeClassC someClassC4 = (SomeClassC)instance;
      refResolver.reference(someClassC4);
      long partFieldInfo = buffer._readInt32OnLE();
      while ((((partFieldInfo & 3L) == ((byte)1)) && (partFieldInfo < 15193L))) {
        if ((fieldResolver.skipDataBy4(buffer, ((int)partFieldInfo)) == 9223372036854775806L)) {
            return someClassC4;
        }
        partFieldInfo = buffer._readInt32OnLE();
      }
      partFieldInfo = this.readEmbedTypes4Fields(someClassC4, buffer, partFieldInfo);
      if ((partFieldInfo == 9223372036854775806L)) {
          return someClassC4;
      }
      while (((partFieldInfo & 3L) == ((byte)1))) {
        if ((fieldResolver.skipDataBy4(buffer, ((int)partFieldInfo)) == 9223372036854775806L)) {
            return someClassC4;
        }
        partFieldInfo = buffer._readInt32OnLE();
      }
      long value16 = buffer._readInt32OnLE();
      partFieldInfo = ((value16 << 32) | (partFieldInfo & 4294967295L));
      while (((partFieldInfo & 7L) == ((byte)3))) {
        if ((fieldResolver.skipDataBy8(buffer, partFieldInfo) == 9223372036854775806L)) {
            return someClassC4;
        }
        partFieldInfo = buffer._readInt64OnLE();
      }
      while (((partFieldInfo & 7L) == ((byte)7))) {
        if ((fieldResolver.skipDataBy8(buffer, partFieldInfo) == 9223372036854775806L)) {
            return someClassC4;
        }
        partFieldInfo = buffer._readInt64OnLE();
      }
      fieldResolver.skipEndFields(buffer, partFieldInfo);
      return someClassC4;
  }

}
