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
import org.apache.fury.builder.Generated.GeneratedObjectSerializer;

public final class BeanBFuryCodec_1 extends GeneratedObjectSerializer {

  private final NoRefResolver refResolver;
  private final ClassResolver classResolver;
  private final StringSerializer strSerializer;
  private Fury fury;
  private final org.apache.fury.serializer.ArraySerializers.IntArraySerializer intArraySerializer;
  private ClassInfo listClassInfo;
  private final ClassInfoHolder list2ClassInfoHolder;

  public BeanBFuryCodec_1(Fury fury, Class classType) {
      super(fury, classType);
      this.fury = fury;
      fury.getClassResolver().setSerializerIfAbsent(classType, this);

      org.apache.fury.resolver.RefResolver refResolver0 = fury.getRefResolver();
      refResolver = ((NoRefResolver)refResolver0);
      classResolver = fury.getClassResolver();
      strSerializer = fury.getStringSerializer();
      intArraySerializer = ((org.apache.fury.serializer.ArraySerializers.IntArraySerializer)classResolver.getRawSerializer(int[].class));
      listClassInfo = classResolver.nilClassInfo();
      list2ClassInfoHolder = classResolver.nilClassInfoHolder();
  }

  private void writeFields(MemoryBuffer memoryBuffer, org.apache.fury.test.bean.BeanB beanB1) {
      Object object1 = Platform.getObject(beanB1, 36L);
      Float f4 = (Float)object1;
      if ((f4 == null)) {
          memoryBuffer.writeByte(((byte)-3));
      } else {
          memoryBuffer.writeByte(((byte)0));
          memoryBuffer.writeFloat32(f4);
      }
      Object object22 = Platform.getObject(beanB1, 32L);
      Integer f2 = (Integer)object22;
      if ((f2 == null)) {
          memoryBuffer.writeByte(((byte)-3));
      } else {
          memoryBuffer.writeByte(((byte)0));
          memoryBuffer.writeVarInt32(f2);
      }
  }

  private AbstractCollectionSerializer writeCollectionClassInfo(MemoryBuffer memoryBuffer1, java.util.List list1) {
      ClassResolver classResolver = this.classResolver;
      Class value = listClassInfo.getCls();
      Class cls = list1.getClass();
      if ((value != cls)) {
          listClassInfo = classResolver.getClassInfo(cls);
      }
      classResolver.writeClass(memoryBuffer1, listClassInfo);
      Serializer serializer = listClassInfo.getSerializer();
      return ((AbstractCollectionSerializer)serializer);
  }

  private void writeFields1(MemoryBuffer memoryBuffer2, org.apache.fury.test.bean.BeanB beanB2) {
      Object object00 = Platform.getObject(beanB2, 44L);
      java.util.List intList = (java.util.List)object00;
      if ((intList == null)) {
          memoryBuffer2.writeByte(((byte)-3));
      } else {
          memoryBuffer2.writeByte(((byte)0));
          AbstractCollectionSerializer abstractCollectionSerializer = this.writeCollectionClassInfo(memoryBuffer2, intList);
          if (abstractCollectionSerializer.supportCodegenHook()) {
              java.util.List list0 = (java.util.List)abstractCollectionSerializer.onCollectionWrite(memoryBuffer2, intList);
              int value0 = list0.size();
              if ((value0 > 0)) {
                  int value1 = abstractCollectionSerializer.writeNullabilityHeader(memoryBuffer2, list0);
                  boolean hasNull = (value1 & 2) == 2;
                  for (int i = 0; i < value0; i+=1) {
                    Object object3 = list0.get(i);
                    Integer castedValue = (Integer)object3;
                    if (hasNull) {
                        if ((castedValue == null)) {
                            memoryBuffer2.writeByte(((byte)-3));
                        } else {
                            memoryBuffer2.writeByte(((byte)0));
                            memoryBuffer2.writeVarInt32(castedValue);
                        }
                    } else {
                        memoryBuffer2.writeVarInt32(castedValue);
                    }
                  }
              }
          } else {
              abstractCollectionSerializer.write(memoryBuffer2, intList);
          }
      }
  }

  private void readFields(MemoryBuffer memoryBuffer3, org.apache.fury.test.bean.BeanB beanB3) {
      if ((memoryBuffer3.readByte() != ((byte)-3))) {
          float value2 = memoryBuffer3._readFloat32OnLE();
          Platform.putObject(beanB3, 36L, ((Float)value2));
      } else {
          Platform.putObject(beanB3, 36L, null);
      }
      if ((memoryBuffer3.readByte() != ((byte)-3))) {
          int value5 = memoryBuffer3._readVarInt32OnLE();
          Platform.putObject(beanB3, 32L, ((Integer)value5));
      } else {
          Platform.putObject(beanB3, 32L, null);
      }
  }

  private void readFields1(MemoryBuffer memoryBuffer4, org.apache.fury.test.bean.BeanB beanB4) {
      if ((memoryBuffer4.readByte() != ((byte)-3))) {
          Serializer serializer0 = classResolver.readClassInfo(memoryBuffer4, list2ClassInfoHolder).getSerializer();
          AbstractCollectionSerializer collectionSerializer = (AbstractCollectionSerializer)serializer0;
          Object object6;
          if (collectionSerializer.supportCodegenHook()) {
              java.util.Collection collection = collectionSerializer.newCollection(memoryBuffer4);
              int size = collectionSerializer.getAndClearNumElements();
              if ((size > 0)) {
                  boolean hasNull0 = (memoryBuffer4.readByte() & 2) == 2;
                  for (int i0 = 0; i0 < size; i0+=1) {
                    if (hasNull0) {
                        if ((memoryBuffer4.readByte() != ((byte)-3))) {
                            collection.add(memoryBuffer4._readVarInt32OnLE());
                        } else {
                            collection.add(null);
                        }
                    } else {
                        collection.add(memoryBuffer4._readVarInt32OnLE());
                    }
                  }
              }
              Object object4 = collectionSerializer.onCollectionRead(collection);
              object6 = object4;
          } else {
              Object object5 = collectionSerializer.read(memoryBuffer4);
              object6 = object5;
          }

          Platform.putObject(beanB4, 44L, ((java.util.List)object6));
      } else {
          Platform.putObject(beanB4, 44L, null);
      }
  }

  @Override public final void write(MemoryBuffer buffer, Object obj) {
      org.apache.fury.test.bean.BeanB beanB5 = (org.apache.fury.test.bean.BeanB)obj;
      buffer.grow(19);
      byte[] base = buffer.getHeapMemory();
      long writerAddr = buffer._unsafeWriterAddress();
      Platform.putDouble(base, writerAddr, Platform.getDouble(beanB5, 24L));
      Platform.putShort(base, (writerAddr + 8L), Platform.getShort(beanB5, 12L));
      buffer._increaseWriterIndexUnsafe(10);
      buffer._unsafeWriteSliInt64(Platform.getLong(beanB5, 16L));
      this.writeFields(buffer, beanB5);
      Object object70 = Platform.getObject(beanB5, 40L);
      int[] intArr = (int[])object70;
      if ((intArr == null)) {
          buffer.writeByte(((byte)-3));
      } else {
          buffer.writeByte(((byte)0));
          intArraySerializer.write(buffer, intArr);
      }
      this.writeFields1(buffer, beanB5);
  }

  @Override public final Object read(MemoryBuffer buffer) {
      org.apache.fury.test.bean.BeanB beanB6 = new org.apache.fury.test.bean.BeanB();
      refResolver.reference(beanB6);
      byte[] heapBuffer = buffer.getHeapMemory();
      buffer.checkReadableBytes(10);
      long readerAddr = buffer.getUnsafeReaderAddress();
      Platform.putDouble(beanB6, 24L, Double.longBitsToDouble(Platform.getLong(heapBuffer, readerAddr)));
      Platform.putShort(beanB6, 12L, Platform.getShort(heapBuffer, (readerAddr + 8L)));
      buffer.increaseReaderIndex(10);
      Platform.putLong(beanB6, 16L, buffer._readSliInt64OnLE());
      this.readFields(buffer, beanB6);
      if ((buffer.readByte() != ((byte)-3))) {
          int[] arr = intArraySerializer.read(buffer);
          Platform.putObject(beanB6, 40L, arr);
      } else {
          Platform.putObject(beanB6, 40L, null);
      }
      this.readFields1(buffer, beanB6);
      return beanB6;
  }

}
