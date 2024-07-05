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

public final class BeanAFuryCodec_1 extends GeneratedObjectSerializer {

  private final NoRefResolver refResolver;
  private final ClassResolver classResolver;
  private final StringSerializer strSerializer;
  private Fury fury;
  private final org.apache.fury.serializer.ArraySerializers.ByteArraySerializer byteArraySerializer;
  private final org.apache.fury.serializer.ArraySerializers.IntArraySerializer intArraySerializer;
  private final org.apache.fury.serializer.ArraySerializers.ObjectArraySerializer objectArraySerializer;
  private final Serializer serializer;
  private ClassInfo iterableClassInfo;
  private ClassInfo bigDecimalClassInfo;
  private ClassInfo listClassInfo;
  private ClassInfo list2ClassInfo;
  private final ClassInfoHolder list4ClassInfoHolder;
  private ClassInfo list11ClassInfo;
  private ClassInfo list18ClassInfo;
  private ClassInfo mapClassInfo;
  private final ClassInfoHolder iterable2ClassInfoHolder;
  private final ClassInfoHolder bigDecimal2ClassInfoHolder;
  private final ClassInfoHolder list21ClassInfoHolder;
  private final ClassInfoHolder list22ClassInfoHolder;
  private final ClassInfoHolder list23ClassInfoHolder;
  private final ClassInfoHolder list24ClassInfoHolder;
  private final ClassInfoHolder map2ClassInfoHolder;

  public BeanAFuryCodec_1(Fury fury, Class classType) {
      super(fury, classType);
      this.fury = fury;
      fury.getClassResolver().setSerializerIfAbsent(classType, this);

      org.apache.fury.resolver.RefResolver refResolver0 = fury.getRefResolver();
      refResolver = ((NoRefResolver)refResolver0);
      classResolver = fury.getClassResolver();
      strSerializer = fury.getStringSerializer();
      byteArraySerializer = ((org.apache.fury.serializer.ArraySerializers.ByteArraySerializer)classResolver.getRawSerializer(byte[].class));
      intArraySerializer = ((org.apache.fury.serializer.ArraySerializers.IntArraySerializer)classResolver.getRawSerializer(int[].class));
      objectArraySerializer = ((org.apache.fury.serializer.ArraySerializers.ObjectArraySerializer)classResolver.getRawSerializer(int[][].class));
      serializer = classResolver.getRawSerializer(org.apache.fury.test.bean.BeanB.class);
      iterableClassInfo = classResolver.nilClassInfo();
      bigDecimalClassInfo = classResolver.nilClassInfo();
      listClassInfo = classResolver.nilClassInfo();
      list2ClassInfo = classResolver.nilClassInfo();
      list4ClassInfoHolder = classResolver.nilClassInfoHolder();
      list11ClassInfo = classResolver.nilClassInfo();
      list18ClassInfo = classResolver.nilClassInfo();
      mapClassInfo = classResolver.nilClassInfo();
      iterable2ClassInfoHolder = classResolver.nilClassInfoHolder();
      bigDecimal2ClassInfoHolder = classResolver.nilClassInfoHolder();
      list21ClassInfoHolder = classResolver.nilClassInfoHolder();
      list22ClassInfoHolder = classResolver.nilClassInfoHolder();
      list23ClassInfoHolder = classResolver.nilClassInfoHolder();
      list24ClassInfoHolder = classResolver.nilClassInfoHolder();
      map2ClassInfoHolder = classResolver.nilClassInfoHolder();
  }

  private void writeFields(org.apache.fury.test.bean.BeanA beanA1, MemoryBuffer memoryBuffer, byte[] arr) {
      long writerAddr = memoryBuffer._unsafeWriterAddress();
      Platform.putDouble(arr, writerAddr, Platform.getDouble(beanA1, 24L));
      Platform.putShort(arr, (writerAddr + 8L), Platform.getShort(beanA1, 12L));
      Platform.putBoolean(arr, (writerAddr + 10L), Platform.getBoolean(beanA1, 14L));
      memoryBuffer._increaseWriterIndexUnsafe(11);
      memoryBuffer._unsafeWriteSliInt64(Platform.getLong(beanA1, 16L));
  }

  private void writeFields1(org.apache.fury.test.bean.BeanA beanA2, MemoryBuffer memoryBuffer1) {
      Object object1 = Platform.getObject(beanA2, 36L);
      Float f4 = (Float)object1;
      if ((f4 == null)) {
          memoryBuffer1.writeByte(((byte)-3));
      } else {
          memoryBuffer1.writeByte(((byte)0));
          memoryBuffer1.writeFloat32(f4);
      }
      Integer f15 = beanA2.f15;
      if ((f15 == null)) {
          memoryBuffer1.writeByte(((byte)-3));
      } else {
          memoryBuffer1.writeByte(((byte)0));
          memoryBuffer1.writeVarInt32(f15);
      }
      Object object22 = Platform.getObject(beanA2, 32L);
      Integer f2 = (Integer)object22;
      if ((f2 == null)) {
          memoryBuffer1.writeByte(((byte)-3));
      } else {
          memoryBuffer1.writeByte(((byte)0));
          memoryBuffer1.writeVarInt32(f2);
      }
  }

  private void writeFields2(org.apache.fury.test.bean.BeanA beanA3, MemoryBuffer memoryBuffer2) {
      StringSerializer strSerializer = this.strSerializer;
      Object object00 = Platform.getObject(beanA3, 48L);
      byte[] bytes = (byte[])object00;
      if ((bytes == null)) {
          memoryBuffer2.writeByte(((byte)-3));
      } else {
          memoryBuffer2.writeByte(((byte)0));
          byteArraySerializer.write(memoryBuffer2, bytes);
      }
      Object object31 = Platform.getObject(beanA3, 44L);
      int[] intArray = (int[])object31;
      if ((intArray == null)) {
          memoryBuffer2.writeByte(((byte)-3));
      } else {
          memoryBuffer2.writeByte(((byte)0));
          intArraySerializer.write(memoryBuffer2, intArray);
      }
      Object object42 = Platform.getObject(beanA3, 88L);
      int[][] int2DArray = (int[][])object42;
      if ((int2DArray == null)) {
          memoryBuffer2.writeByte(((byte)-3));
      } else {
          memoryBuffer2.writeByte(((byte)0));
          objectArraySerializer.write(memoryBuffer2, int2DArray);
      }
      String f17 = beanA3.f17;
      if ((f17 == null)) {
          memoryBuffer2.writeByte(((byte)-3));
      } else {
          memoryBuffer2.writeByte(((byte)0));
          strSerializer.writeCharsStringCompressed(memoryBuffer2, f17);
      }
      String longStringField = beanA3.longStringField;
      if ((longStringField == null)) {
          memoryBuffer2.writeByte(((byte)-3));
      } else {
          memoryBuffer2.writeByte(((byte)0));
          strSerializer.writeCharsStringCompressed(memoryBuffer2, longStringField);
      }
      Object object53 = Platform.getObject(beanA3, 40L);
      org.apache.fury.test.bean.BeanB beanB = (org.apache.fury.test.bean.BeanB)object53;
      if ((beanB == null)) {
          memoryBuffer2.writeByte(((byte)-3));
      } else {
          memoryBuffer2.writeByte(((byte)0));
          serializer.write(memoryBuffer2, beanB);
      }
  }

  private void writeClassAndObject(MemoryBuffer memoryBuffer3, Iterable iterable1) {
      ClassResolver classResolver = this.classResolver;
      Class value0 = iterableClassInfo.getCls();
      Class cls = iterable1.getClass();
      if ((value0 != cls)) {
          iterableClassInfo = classResolver.getClassInfo(cls);
      }
      classResolver.writeClass(memoryBuffer3, iterableClassInfo);
      iterableClassInfo.getSerializer().write(memoryBuffer3, iterable1);
  }

  private void writeClassAndObject1(java.math.BigDecimal bigDecimal1, MemoryBuffer memoryBuffer4) {
      ClassResolver classResolver = this.classResolver;
      Class value3 = bigDecimalClassInfo.getCls();
      Class cls0 = bigDecimal1.getClass();
      if ((value3 != cls0)) {
          bigDecimalClassInfo = classResolver.getClassInfo(cls0);
      }
      classResolver.writeClass(memoryBuffer4, bigDecimalClassInfo);
      bigDecimalClassInfo.getSerializer().write(memoryBuffer4, bigDecimal1);
  }

  private void writeFields3(org.apache.fury.test.bean.BeanA beanA4, MemoryBuffer memoryBuffer5) {
      Object object60 = Platform.getObject(beanA4, 76L);
      Iterable beanBIterable = (Iterable)object60;
      if ((beanBIterable == null)) {
          memoryBuffer5.writeByte(((byte)-3));
      } else {
          memoryBuffer5.writeByte(((byte)0));
          this.writeClassAndObject(memoryBuffer5, beanBIterable);
      }
      java.math.BigDecimal f16 = beanA4.f16;
      if ((f16 == null)) {
          memoryBuffer5.writeByte(((byte)-3));
      } else {
          memoryBuffer5.writeByte(((byte)0));
          this.writeClassAndObject1(f16, memoryBuffer5);
      }
  }

  private AbstractCollectionSerializer writeCollectionClassInfo(java.util.List list1, MemoryBuffer memoryBuffer6) {
      ClassResolver classResolver = this.classResolver;
      Class value4 = listClassInfo.getCls();
      Class cls1 = list1.getClass();
      if ((value4 != cls1)) {
          listClassInfo = classResolver.getClassInfo(cls1);
      }
      classResolver.writeClass(memoryBuffer6, listClassInfo);
      Serializer serializer0 = listClassInfo.getSerializer();
      return ((AbstractCollectionSerializer)serializer0);
  }

  private void writeFields4(org.apache.fury.test.bean.BeanA beanA5, MemoryBuffer memoryBuffer7) {
      Serializer serializer = this.serializer;
      Object object70 = Platform.getObject(beanA5, 80L);
      java.util.List beanBList = (java.util.List)object70;
      if ((beanBList == null)) {
          memoryBuffer7.writeByte(((byte)-3));
      } else {
          memoryBuffer7.writeByte(((byte)0));
          AbstractCollectionSerializer abstractCollectionSerializer = this.writeCollectionClassInfo(beanBList, memoryBuffer7);
          if (abstractCollectionSerializer.supportCodegenHook()) {
              java.util.List list0 = (java.util.List)abstractCollectionSerializer.onCollectionWrite(memoryBuffer7, beanBList);
              int value5 = list0.size();
              if ((value5 > 0)) {
                  int value6 = abstractCollectionSerializer.writeNullabilityHeader(memoryBuffer7, list0);
                  boolean hasNull = (value6 & 2) == 2;
                  for (int i = 0; i < value5; i+=1) {
                    Object object8 = list0.get(i);
                    org.apache.fury.test.bean.BeanB castedValue = (org.apache.fury.test.bean.BeanB)object8;
                    if (hasNull) {
                        if ((castedValue == null)) {
                            memoryBuffer7.writeByte(((byte)-3));
                        } else {
                            memoryBuffer7.writeByte(((byte)0));
                            serializer.write(memoryBuffer7, castedValue);
                        }
                    } else {
                        serializer.write(memoryBuffer7, castedValue);
                    }
                  }
              }
          } else {
              abstractCollectionSerializer.write(memoryBuffer7, beanBList);
          }
      }
  }

  private AbstractCollectionSerializer writeCollectionClassInfo1(MemoryBuffer memoryBuffer8, java.util.List list3) {
      ClassResolver classResolver = this.classResolver;
      Class value7 = list2ClassInfo.getCls();
      Class cls2 = list3.getClass();
      if ((value7 != cls2)) {
          list2ClassInfo = classResolver.getClassInfo(cls2);
      }
      classResolver.writeClass(memoryBuffer8, list2ClassInfo);
      Serializer serializer1 = list2ClassInfo.getSerializer();
      return ((AbstractCollectionSerializer)serializer1);
  }

  private void writeCollection(MemoryBuffer memoryBuffer10, java.util.List list6, AbstractCollectionSerializer abstractCollectionSerializer0) {
      if (abstractCollectionSerializer0.supportCodegenHook()) {
          java.util.List list7 = (java.util.List)abstractCollectionSerializer0.onCollectionWrite(memoryBuffer10, list6);
          int value10 = list7.size();
          if ((value10 > 0)) {
              int value11 = abstractCollectionSerializer0.writeNullabilityHeader(memoryBuffer10, list7);
              boolean hasNull0 = (value11 & 2) == 2;
              for (int i1 = 0; i1 < value10; i1+=1) {
                Object object9 = list7.get(i1);
                Double castedValue1 = (Double)object9;
                if (hasNull0) {
                    if ((castedValue1 == null)) {
                        memoryBuffer10.writeByte(((byte)-3));
                    } else {
                        memoryBuffer10.writeByte(((byte)0));
                        memoryBuffer10.writeFloat64(castedValue1);
                    }
                } else {
                    memoryBuffer10.writeFloat64(castedValue1);
                }
              }
          }
      } else {
          abstractCollectionSerializer0.write(memoryBuffer10, list6);
      }
  }

  private void writeCollection1(MemoryBuffer memoryBuffer11, java.util.List list8, AbstractCollectionSerializer abstractCollectionSerializer1) {
      if (abstractCollectionSerializer1.supportCodegenHook()) {
          java.util.List list9 = (java.util.List)abstractCollectionSerializer1.onCollectionWrite(memoryBuffer11, list8);
          int value12 = list9.size();
          if ((value12 > 0)) {
              int value13 = abstractCollectionSerializer1.writeNullabilityHeader(memoryBuffer11, list9);
              boolean hasNull1 = (value13 & 2) == 2;
              for (int i2 = 0; i2 < value12; i2+=1) {
                Object object10 = list9.get(i2);
                Double castedValue2 = (Double)object10;
                if (hasNull1) {
                    if ((castedValue2 == null)) {
                        memoryBuffer11.writeByte(((byte)-3));
                    } else {
                        memoryBuffer11.writeByte(((byte)0));
                        memoryBuffer11.writeFloat64(castedValue2);
                    }
                } else {
                    memoryBuffer11.writeFloat64(castedValue2);
                }
              }
          }
      } else {
          abstractCollectionSerializer1.write(memoryBuffer11, list8);
      }
  }

  private void sameElementClassWrite(java.util.List list5, int value8, MemoryBuffer memoryBuffer9, boolean value9) {
      Serializer serializer2 = list4ClassInfoHolder.getSerializer();
      AbstractCollectionSerializer castedValue0 = (AbstractCollectionSerializer)serializer2;
      for (int i0 = 0; i0 < value8; i0+=1) {
        Object object11 = list5.get(i0);
        java.util.List castedValue3 = (java.util.List)object11;
        if (value9) {
            if ((castedValue3 == null)) {
                memoryBuffer9.writeByte(((byte)-3));
            } else {
                memoryBuffer9.writeByte(((byte)0));
                this.writeCollection(memoryBuffer9, castedValue3, castedValue0);
            }
        } else {
            this.writeCollection1(memoryBuffer9, castedValue3, castedValue0);
        }
      }
  }

  private AbstractCollectionSerializer writeCollectionClassInfo2(java.util.List list12, MemoryBuffer memoryBuffer13) {
      ClassResolver classResolver = this.classResolver;
      Class value16 = list11ClassInfo.getCls();
      Class cls3 = list12.getClass();
      if ((value16 != cls3)) {
          list11ClassInfo = classResolver.getClassInfo(cls3);
      }
      classResolver.writeClass(memoryBuffer13, list11ClassInfo);
      Serializer serializer3 = list11ClassInfo.getSerializer();
      return ((AbstractCollectionSerializer)serializer3);
  }

  private void writeCollection2(java.util.List list13, AbstractCollectionSerializer abstractCollectionSerializer3, MemoryBuffer memoryBuffer14) {
      if (abstractCollectionSerializer3.supportCodegenHook()) {
          java.util.List list14 = (java.util.List)abstractCollectionSerializer3.onCollectionWrite(memoryBuffer14, list13);
          int value17 = list14.size();
          if ((value17 > 0)) {
              int value18 = abstractCollectionSerializer3.writeNullabilityHeader(memoryBuffer14, list14);
              boolean hasNull3 = (value18 & 2) == 2;
              for (int i4 = 0; i4 < value17; i4+=1) {
                Object object13 = list14.get(i4);
                Double castedValue4 = (Double)object13;
                if (hasNull3) {
                    if ((castedValue4 == null)) {
                        memoryBuffer14.writeByte(((byte)-3));
                    } else {
                        memoryBuffer14.writeByte(((byte)0));
                        memoryBuffer14.writeFloat64(castedValue4);
                    }
                } else {
                    memoryBuffer14.writeFloat64(castedValue4);
                }
              }
          }
      } else {
          abstractCollectionSerializer3.write(memoryBuffer14, list13);
      }
  }

  private AbstractCollectionSerializer writeCollectionClassInfo3(java.util.List list15, MemoryBuffer memoryBuffer15) {
      ClassResolver classResolver = this.classResolver;
      Class value19 = list11ClassInfo.getCls();
      Class cls4 = list15.getClass();
      if ((value19 != cls4)) {
          list11ClassInfo = classResolver.getClassInfo(cls4);
      }
      classResolver.writeClass(memoryBuffer15, list11ClassInfo);
      Serializer serializer4 = list11ClassInfo.getSerializer();
      return ((AbstractCollectionSerializer)serializer4);
  }

  private void writeCollection3(java.util.List list16, AbstractCollectionSerializer abstractCollectionSerializer4, MemoryBuffer memoryBuffer16) {
      if (abstractCollectionSerializer4.supportCodegenHook()) {
          java.util.List list17 = (java.util.List)abstractCollectionSerializer4.onCollectionWrite(memoryBuffer16, list16);
          int value20 = list17.size();
          if ((value20 > 0)) {
              int value21 = abstractCollectionSerializer4.writeNullabilityHeader(memoryBuffer16, list17);
              boolean hasNull4 = (value21 & 2) == 2;
              for (int i5 = 0; i5 < value20; i5+=1) {
                Object object14 = list17.get(i5);
                Double castedValue5 = (Double)object14;
                if (hasNull4) {
                    if ((castedValue5 == null)) {
                        memoryBuffer16.writeByte(((byte)-3));
                    } else {
                        memoryBuffer16.writeByte(((byte)0));
                        memoryBuffer16.writeFloat64(castedValue5);
                    }
                } else {
                    memoryBuffer16.writeFloat64(castedValue5);
                }
              }
          }
      } else {
          abstractCollectionSerializer4.write(memoryBuffer16, list16);
      }
  }

  private void writeFields5(org.apache.fury.test.bean.BeanA beanA6, MemoryBuffer memoryBuffer12) {
      Object object120 = Platform.getObject(beanA6, 92L);
      java.util.List double2DList = (java.util.List)object120;
      if ((double2DList == null)) {
          memoryBuffer12.writeByte(((byte)-3));
      } else {
          memoryBuffer12.writeByte(((byte)0));
          AbstractCollectionSerializer abstractCollectionSerializer2 = this.writeCollectionClassInfo1(memoryBuffer12, double2DList);
          if (abstractCollectionSerializer2.supportCodegenHook()) {
              java.util.List list10 = (java.util.List)abstractCollectionSerializer2.onCollectionWrite(memoryBuffer12, double2DList);
              int value14 = list10.size();
              if ((value14 > 0)) {
                  int value15 = abstractCollectionSerializer2.writeTypeNullabilityHeader(memoryBuffer12, list10, java.util.List.class, list4ClassInfoHolder);
                  boolean sameElementClass = (value15 & 8) != 8;
                  boolean hasNull2 = (value15 & 2) == 2;
                  if (sameElementClass) {
                      this.sameElementClassWrite(list10, value14, memoryBuffer12, hasNull2);
                  } else {
                      for (int i3 = 0; i3 < value14; i3+=1) {
                        Object object15 = list10.get(i3);
                        java.util.List castedValue6 = (java.util.List)object15;
                        if (hasNull2) {
                            if ((castedValue6 == null)) {
                                memoryBuffer12.writeByte(((byte)-3));
                            } else {
                                memoryBuffer12.writeByte(((byte)0));
                                AbstractCollectionSerializer abstractCollectionSerializer5 = this.writeCollectionClassInfo2(castedValue6, memoryBuffer12);
                                this.writeCollection2(castedValue6, abstractCollectionSerializer5, memoryBuffer12);
                            }
                        } else {
                            AbstractCollectionSerializer abstractCollectionSerializer6 = this.writeCollectionClassInfo3(castedValue6, memoryBuffer12);
                            this.writeCollection3(castedValue6, abstractCollectionSerializer6, memoryBuffer12);
                        }
                      }
                  }
              }
          } else {
              abstractCollectionSerializer2.write(memoryBuffer12, double2DList);
          }
      }
  }

  private AbstractCollectionSerializer writeCollectionClassInfo4(java.util.List list19, MemoryBuffer memoryBuffer17) {
      ClassResolver classResolver = this.classResolver;
      Class value22 = list18ClassInfo.getCls();
      Class cls5 = list19.getClass();
      if ((value22 != cls5)) {
          list18ClassInfo = classResolver.getClassInfo(cls5);
      }
      classResolver.writeClass(memoryBuffer17, list18ClassInfo);
      Serializer serializer5 = list18ClassInfo.getSerializer();
      return ((AbstractCollectionSerializer)serializer5);
  }

  private void writeFields6(org.apache.fury.test.bean.BeanA beanA7, MemoryBuffer memoryBuffer18) {
      Object object160 = Platform.getObject(beanA7, 72L);
      java.util.List doubleList = (java.util.List)object160;
      if ((doubleList == null)) {
          memoryBuffer18.writeByte(((byte)-3));
      } else {
          memoryBuffer18.writeByte(((byte)0));
          AbstractCollectionSerializer abstractCollectionSerializer7 = this.writeCollectionClassInfo4(doubleList, memoryBuffer18);
          if (abstractCollectionSerializer7.supportCodegenHook()) {
              java.util.List list20 = (java.util.List)abstractCollectionSerializer7.onCollectionWrite(memoryBuffer18, doubleList);
              int value23 = list20.size();
              if ((value23 > 0)) {
                  int value24 = abstractCollectionSerializer7.writeNullabilityHeader(memoryBuffer18, list20);
                  boolean hasNull5 = (value24 & 2) == 2;
                  for (int i6 = 0; i6 < value23; i6+=1) {
                    Object object17 = list20.get(i6);
                    Double castedValue7 = (Double)object17;
                    if (hasNull5) {
                        if ((castedValue7 == null)) {
                            memoryBuffer18.writeByte(((byte)-3));
                        } else {
                            memoryBuffer18.writeByte(((byte)0));
                            memoryBuffer18.writeFloat64(castedValue7);
                        }
                    } else {
                        memoryBuffer18.writeFloat64(castedValue7);
                    }
                  }
              }
          } else {
              abstractCollectionSerializer7.write(memoryBuffer18, doubleList);
          }
      }
  }

  private AbstractMapSerializer writeMapClassInfo(MemoryBuffer memoryBuffer19, java.util.Map map1) {
      ClassResolver classResolver = this.classResolver;
      Class value25 = mapClassInfo.getCls();
      Class cls6 = map1.getClass();
      if ((value25 != cls6)) {
          mapClassInfo = classResolver.getClassInfo(cls6);
      }
      classResolver.writeClass(memoryBuffer19, mapClassInfo);
      Serializer serializer6 = mapClassInfo.getSerializer();
      return ((AbstractMapSerializer)serializer6);
  }

  private void writeFields7(org.apache.fury.test.bean.BeanA beanA8, MemoryBuffer memoryBuffer20) {
      Object object180 = Platform.getObject(beanA8, 84L);
      java.util.Map stringBeanBMap = (java.util.Map)object180;
      if ((stringBeanBMap == null)) {
          memoryBuffer20.writeByte(((byte)-3));
      } else {
          memoryBuffer20.writeByte(((byte)0));
          AbstractMapSerializer abstractMapSerializer = this.writeMapClassInfo(memoryBuffer20, stringBeanBMap);
          if (abstractMapSerializer.supportCodegenHook()) {
              java.util.Map map0 = abstractMapSerializer.onMapWrite(memoryBuffer20, stringBeanBMap);
              java.util.Set entrySet = map0.entrySet();
              java.util.Iterator iter = entrySet.iterator();
              int i7 = 0;
              while (iter.hasNext()) {
                  Object elemValue = iter.next();
                  java.util.Map.Entry entry = (java.util.Map.Entry)elemValue;
                  Object keyObj = entry.getKey();
                  String key = (String)keyObj;
                  if ((key == null)) {
                      memoryBuffer20.writeByte(((byte)-3));
                  } else {
                      memoryBuffer20.writeByte(((byte)0));
                      strSerializer.writeCharsStringCompressed(memoryBuffer20, key);
                  }
                  Object valueObj = entry.getValue();
                  org.apache.fury.test.bean.BeanB value26 = (org.apache.fury.test.bean.BeanB)valueObj;
                  if ((value26 == null)) {
                      memoryBuffer20.writeByte(((byte)-3));
                  } else {
                      memoryBuffer20.writeByte(((byte)0));
                      serializer.write(memoryBuffer20, value26);
                  }
                  i7++;
              }
          } else {
              abstractMapSerializer.write(memoryBuffer20, stringBeanBMap);
          }
      }
  }

  private void readFields(MemoryBuffer memoryBuffer21, byte[] arr1, org.apache.fury.test.bean.BeanA beanA9) {
      long readerAddr = memoryBuffer21.getUnsafeReaderAddress();
      Platform.putDouble(beanA9, 24L, Double.longBitsToDouble(Platform.getLong(arr1, readerAddr)));
      Platform.putShort(beanA9, 12L, Platform.getShort(arr1, (readerAddr + 8L)));
      Platform.putBoolean(beanA9, 14L, Platform.getBoolean(arr1, (readerAddr + 10L)));
      memoryBuffer21.increaseReaderIndex(11);
      Platform.putLong(beanA9, 16L, memoryBuffer21._readSliInt64OnLE());
  }

  private void readFields1(org.apache.fury.test.bean.BeanA beanA10, MemoryBuffer memoryBuffer22) {
      if ((memoryBuffer22.readByte() != ((byte)-3))) {
          float value31 = memoryBuffer22._readFloat32OnLE();
          Platform.putObject(beanA10, 36L, ((Float)value31));
      } else {
          Platform.putObject(beanA10, 36L, null);
      }
      if ((memoryBuffer22.readByte() != ((byte)-3))) {
          int value34 = memoryBuffer22._readVarInt32OnLE();
          beanA10.f15 = ((Integer)value34);
      } else {
          beanA10.f15 = null;
      }
      if ((memoryBuffer22.readByte() != ((byte)-3))) {
          int value35 = memoryBuffer22._readVarInt32OnLE();
          Platform.putObject(beanA10, 32L, ((Integer)value35));
      } else {
          Platform.putObject(beanA10, 32L, null);
      }
  }

  private void readFields2(org.apache.fury.test.bean.BeanA beanA11, MemoryBuffer memoryBuffer23) {
      StringSerializer strSerializer = this.strSerializer;
      if ((memoryBuffer23.readByte() != ((byte)-3))) {
          byte[] arr0 = byteArraySerializer.read(memoryBuffer23);
          Platform.putObject(beanA11, 48L, arr0);
      } else {
          Platform.putObject(beanA11, 48L, null);
      }
      if ((memoryBuffer23.readByte() != ((byte)-3))) {
          int[] arr2 = intArraySerializer.read(memoryBuffer23);
          Platform.putObject(beanA11, 44L, arr2);
      } else {
          Platform.putObject(beanA11, 44L, null);
      }
      if ((memoryBuffer23.readByte() != ((byte)-3))) {
          Object[] arr3 = objectArraySerializer.read(memoryBuffer23);
          Platform.putObject(beanA11, 88L, ((int[][])arr3));
      } else {
          Platform.putObject(beanA11, 88L, null);
      }
      if ((memoryBuffer23.readByte() != ((byte)-3))) {
          String string = strSerializer.readCompressedCharsString(memoryBuffer23);
          beanA11.f17 = string;
      } else {
          beanA11.f17 = null;
      }
      if ((memoryBuffer23.readByte() != ((byte)-3))) {
          String string1 = strSerializer.readCompressedCharsString(memoryBuffer23);
          beanA11.longStringField = string1;
      } else {
          beanA11.longStringField = null;
      }
  }

  private void readFields3(org.apache.fury.test.bean.BeanA beanA12, MemoryBuffer memoryBuffer24) {
      ClassResolver classResolver = this.classResolver;
      if ((memoryBuffer24.readByte() != ((byte)-3))) {
          Object object19 = classResolver.readClassInfo(memoryBuffer24, iterable2ClassInfoHolder).getSerializer().read(memoryBuffer24);
          Platform.putObject(beanA12, 76L, ((Iterable)object19));
      } else {
          Platform.putObject(beanA12, 76L, null);
      }
      if ((memoryBuffer24.readByte() != ((byte)-3))) {
          Object object20 = classResolver.readClassInfo(memoryBuffer24, bigDecimal2ClassInfoHolder).getSerializer().read(memoryBuffer24);
          beanA12.f16 = ((java.math.BigDecimal)object20);
      } else {
          beanA12.f16 = null;
      }
  }

  private void readFields4(org.apache.fury.test.bean.BeanA beanA13, MemoryBuffer memoryBuffer25) {
      Serializer serializer = this.serializer;
      if ((memoryBuffer25.readByte() != ((byte)-3))) {
          Serializer serializer7 = classResolver.readClassInfo(memoryBuffer25, list21ClassInfoHolder).getSerializer();
          AbstractCollectionSerializer collectionSerializer = (AbstractCollectionSerializer)serializer7;
          Object object24;
          if (collectionSerializer.supportCodegenHook()) {
              java.util.Collection collection = collectionSerializer.newCollection(memoryBuffer25);
              int size = collectionSerializer.getAndClearNumElements();
              if ((size > 0)) {
                  boolean hasNull6 = (memoryBuffer25.readByte() & 2) == 2;
                  for (int i8 = 0; i8 < size; i8+=1) {
                    if (hasNull6) {
                        if ((memoryBuffer25.readByte() != ((byte)-3))) {
                            collection.add(serializer.read(memoryBuffer25));
                        } else {
                            collection.add(null);
                        }
                    } else {
                        collection.add(serializer.read(memoryBuffer25));
                    }
                  }
              }
              Object object21 = collectionSerializer.onCollectionRead(collection);
              object24 = object21;
          } else {
              Object object23 = collectionSerializer.read(memoryBuffer25);
              object24 = object23;
          }

          Platform.putObject(beanA13, 80L, ((java.util.List)object24));
      } else {
          Platform.putObject(beanA13, 80L, null);
      }
  }

  private Object readCollection(AbstractCollectionSerializer abstractCollectionSerializer8, MemoryBuffer memoryBuffer27, boolean value50) {
      Object object27;
      if (abstractCollectionSerializer8.supportCodegenHook()) {
          java.util.Collection collection1 = abstractCollectionSerializer8.newCollection(memoryBuffer27);
          int size0 = abstractCollectionSerializer8.getAndClearNumElements();
          if ((size0 > 0)) {
              boolean hasNull7 = (memoryBuffer27.readByte() & 2) == 2;
              for (int i10 = 0; i10 < size0; i10+=1) {
                if (hasNull7) {
                    if ((memoryBuffer27.readByte() != ((byte)-3))) {
                        collection1.add(memoryBuffer27._readFloat64OnLE());
                    } else {
                        collection1.add(null);
                    }
                } else {
                    collection1.add(memoryBuffer27._readFloat64OnLE());
                }
              }
          }
          Object object25 = abstractCollectionSerializer8.onCollectionRead(collection1);
          object27 = object25;
      } else {
          Object object26 = abstractCollectionSerializer8.read(memoryBuffer27);
          object27 = object26;
      }
      return object27;
  }

  private Object readCollection1(AbstractCollectionSerializer abstractCollectionSerializer9, MemoryBuffer memoryBuffer28, boolean value51) {
      Object object30;
      if (abstractCollectionSerializer9.supportCodegenHook()) {
          java.util.Collection collection2 = abstractCollectionSerializer9.newCollection(memoryBuffer28);
          int size1 = abstractCollectionSerializer9.getAndClearNumElements();
          if ((size1 > 0)) {
              boolean hasNull8 = (memoryBuffer28.readByte() & 2) == 2;
              for (int i11 = 0; i11 < size1; i11+=1) {
                if (hasNull8) {
                    if ((memoryBuffer28.readByte() != ((byte)-3))) {
                        collection2.add(memoryBuffer28._readFloat64OnLE());
                    } else {
                        collection2.add(null);
                    }
                } else {
                    collection2.add(memoryBuffer28._readFloat64OnLE());
                }
              }
          }
          Object object28 = abstractCollectionSerializer9.onCollectionRead(collection2);
          object30 = object28;
      } else {
          Object object29 = abstractCollectionSerializer9.read(memoryBuffer28);
          object30 = object29;
      }
      return object30;
  }

  private void sameElementClassRead(boolean value48, MemoryBuffer memoryBuffer26, int value49, java.util.Collection collection0) {
      Serializer serializer8 = classResolver.readClassInfo(memoryBuffer26, list4ClassInfoHolder).getSerializer();
      AbstractCollectionSerializer castedValue8 = (AbstractCollectionSerializer)serializer8;
      for (int i9 = 0; i9 < value49; i9+=1) {
        if (value48) {
            if ((memoryBuffer26.readByte() != ((byte)-3))) {
                collection0.add(this.readCollection(castedValue8, memoryBuffer26, value48));
            } else {
                collection0.add(null);
            }
        } else {
            collection0.add(this.readCollection1(castedValue8, memoryBuffer26, value48));
        }
      }
  }

  private Object readCollection2(boolean value52, MemoryBuffer memoryBuffer30) {
      Serializer serializer10 = classResolver.readClassInfo(memoryBuffer30, list23ClassInfoHolder).getSerializer();
      AbstractCollectionSerializer collectionSerializer1 = (AbstractCollectionSerializer)serializer10;
      Object object34;
      if (collectionSerializer1.supportCodegenHook()) {
          java.util.Collection collection4 = collectionSerializer1.newCollection(memoryBuffer30);
          int size3 = collectionSerializer1.getAndClearNumElements();
          if ((size3 > 0)) {
              boolean hasNull10 = (memoryBuffer30.readByte() & 2) == 2;
              for (int i13 = 0; i13 < size3; i13+=1) {
                if (hasNull10) {
                    if ((memoryBuffer30.readByte() != ((byte)-3))) {
                        collection4.add(memoryBuffer30._readFloat64OnLE());
                    } else {
                        collection4.add(null);
                    }
                } else {
                    collection4.add(memoryBuffer30._readFloat64OnLE());
                }
              }
          }
          Object object32 = collectionSerializer1.onCollectionRead(collection4);
          object34 = object32;
      } else {
          Object object33 = collectionSerializer1.read(memoryBuffer30);
          object34 = object33;
      }
      return object34;
  }

  private Object readCollection3(boolean value53, MemoryBuffer memoryBuffer31) {
      Serializer serializer11 = classResolver.readClassInfo(memoryBuffer31, list23ClassInfoHolder).getSerializer();
      AbstractCollectionSerializer collectionSerializer2 = (AbstractCollectionSerializer)serializer11;
      Object object37;
      if (collectionSerializer2.supportCodegenHook()) {
          java.util.Collection collection5 = collectionSerializer2.newCollection(memoryBuffer31);
          int size4 = collectionSerializer2.getAndClearNumElements();
          if ((size4 > 0)) {
              boolean hasNull11 = (memoryBuffer31.readByte() & 2) == 2;
              for (int i14 = 0; i14 < size4; i14+=1) {
                if (hasNull11) {
                    if ((memoryBuffer31.readByte() != ((byte)-3))) {
                        collection5.add(memoryBuffer31._readFloat64OnLE());
                    } else {
                        collection5.add(null);
                    }
                } else {
                    collection5.add(memoryBuffer31._readFloat64OnLE());
                }
              }
          }
          Object object35 = collectionSerializer2.onCollectionRead(collection5);
          object37 = object35;
      } else {
          Object object36 = collectionSerializer2.read(memoryBuffer31);
          object37 = object36;
      }
      return object37;
  }

  private void readFields5(org.apache.fury.test.bean.BeanA beanA14, MemoryBuffer memoryBuffer29) {
      if ((memoryBuffer29.readByte() != ((byte)-3))) {
          Serializer serializer9 = classResolver.readClassInfo(memoryBuffer29, list22ClassInfoHolder).getSerializer();
          AbstractCollectionSerializer collectionSerializer0 = (AbstractCollectionSerializer)serializer9;
          Object object40;
          if (collectionSerializer0.supportCodegenHook()) {
              java.util.Collection collection3 = collectionSerializer0.newCollection(memoryBuffer29);
              int size2 = collectionSerializer0.getAndClearNumElements();
              if ((size2 > 0)) {
                  int flags = memoryBuffer29.readByte();
                  boolean sameElementClass0 = (flags & 8) != 8;
                  boolean hasNull9 = (flags & 2) == 2;
                  if (sameElementClass0) {
                      this.sameElementClassRead(hasNull9, memoryBuffer29, size2, collection3);
                  } else {
                      for (int i12 = 0; i12 < size2; i12+=1) {
                        if (hasNull9) {
                            if ((memoryBuffer29.readByte() != ((byte)-3))) {
                                collection3.add(this.readCollection2(hasNull9, memoryBuffer29));
                            } else {
                                collection3.add(null);
                            }
                        } else {
                            collection3.add(this.readCollection3(hasNull9, memoryBuffer29));
                        }
                      }
                  }
              }
              Object object38 = collectionSerializer0.onCollectionRead(collection3);
              object40 = object38;
          } else {
              Object object39 = collectionSerializer0.read(memoryBuffer29);
              object40 = object39;
          }

          Platform.putObject(beanA14, 92L, ((java.util.List)object40));
      } else {
          Platform.putObject(beanA14, 92L, null);
      }
  }

  private void readFields6(org.apache.fury.test.bean.BeanA beanA15, MemoryBuffer memoryBuffer32) {
      if ((memoryBuffer32.readByte() != ((byte)-3))) {
          Serializer serializer12 = classResolver.readClassInfo(memoryBuffer32, list24ClassInfoHolder).getSerializer();
          AbstractCollectionSerializer collectionSerializer3 = (AbstractCollectionSerializer)serializer12;
          Object object44;
          if (collectionSerializer3.supportCodegenHook()) {
              java.util.Collection collection6 = collectionSerializer3.newCollection(memoryBuffer32);
              int size5 = collectionSerializer3.getAndClearNumElements();
              if ((size5 > 0)) {
                  boolean hasNull12 = (memoryBuffer32.readByte() & 2) == 2;
                  for (int i15 = 0; i15 < size5; i15+=1) {
                    if (hasNull12) {
                        if ((memoryBuffer32.readByte() != ((byte)-3))) {
                            collection6.add(memoryBuffer32._readFloat64OnLE());
                        } else {
                            collection6.add(null);
                        }
                    } else {
                        collection6.add(memoryBuffer32._readFloat64OnLE());
                    }
                  }
              }
              Object object41 = collectionSerializer3.onCollectionRead(collection6);
              object44 = object41;
          } else {
              Object object43 = collectionSerializer3.read(memoryBuffer32);
              object44 = object43;
          }

          Platform.putObject(beanA15, 72L, ((java.util.List)object44));
      } else {
          Platform.putObject(beanA15, 72L, null);
      }
  }

  private void readFields7(org.apache.fury.test.bean.BeanA beanA16, MemoryBuffer memoryBuffer33) {
      if ((memoryBuffer33.readByte() != ((byte)-3))) {
          Serializer serializer13 = classResolver.readClassInfo(memoryBuffer33, map2ClassInfoHolder).getSerializer();
          AbstractMapSerializer mapSerializer = (AbstractMapSerializer)serializer13;
          Object object49;
          if (mapSerializer.supportCodegenHook()) {
              java.util.Map map3 = mapSerializer.newMap(memoryBuffer33);
              int size6 = mapSerializer.getAndClearNumElements();
              for (int i16 = 0; i16 < size6; i16+=1) {
                String string2;
                if ((memoryBuffer33.readByte() != ((byte)-3))) {
                    String string0 = strSerializer.readCompressedCharsString(memoryBuffer33);
                    string2 = string0;
                } else {
                    string2 = null;
                }
                Object object46;
                if ((memoryBuffer33.readByte() != ((byte)-3))) {
                    Object object45 = serializer.read(memoryBuffer33);
                    object46 = object45;
                } else {
                    object46 = null;
                }
                map3.put(string2, object46);
              }
              Object object47 = mapSerializer.onMapRead(map3);
              object49 = object47;
          } else {
              Object object48 = mapSerializer.read(memoryBuffer33);
              object49 = object48;
          }

          Platform.putObject(beanA16, 84L, ((java.util.Map)object49));
      } else {
          Platform.putObject(beanA16, 84L, null);
      }
  }

  @Override public final void write(MemoryBuffer buffer, Object obj) {
      org.apache.fury.test.bean.BeanA beanA17 = (org.apache.fury.test.bean.BeanA)obj;
      buffer.grow(20);
      byte[] base = buffer.getHeapMemory();
      this.writeFields(beanA17, buffer, base);
      this.writeFields1(beanA17, buffer);
      this.writeFields2(beanA17, buffer);
      this.writeFields3(beanA17, buffer);
      this.writeFields4(beanA17, buffer);
      this.writeFields5(beanA17, buffer);
      this.writeFields6(beanA17, buffer);
      this.writeFields7(beanA17, buffer);
  }

  @Override public final Object read(MemoryBuffer buffer) {
      org.apache.fury.test.bean.BeanA beanA18 = new org.apache.fury.test.bean.BeanA();
      refResolver.reference(beanA18);
      byte[] heapBuffer = buffer.getHeapMemory();
      buffer.checkReadableBytes(11);
      this.readFields(buffer, heapBuffer, beanA18);
      this.readFields1(beanA18, buffer);
      this.readFields2(beanA18, buffer);
      if ((buffer.readByte() != ((byte)-3))) {
          Object object50 = serializer.read(buffer);
          Platform.putObject(beanA18, 40L, ((org.apache.fury.test.bean.BeanB)object50));
      } else {
          Platform.putObject(beanA18, 40L, null);
      }
      this.readFields3(beanA18, buffer);
      this.readFields4(beanA18, buffer);
      this.readFields5(beanA18, buffer);
      this.readFields6(beanA18, buffer);
      this.readFields7(beanA18, buffer);
      return beanA18;
  }

}
