// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public interface FieldDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dictionary.FieldDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.dictionary.ErrorMessage errorMessage = 1;</code>
   */
  boolean hasErrorMessage();
  /**
   * <code>.dictionary.ErrorMessage errorMessage = 1;</code>
   */
  org.spin.grpc.util.ErrorMessage getErrorMessage();
  /**
   * <code>.dictionary.ErrorMessage errorMessage = 1;</code>
   */
  org.spin.grpc.util.ErrorMessageOrBuilder getErrorMessageOrBuilder();

  /**
   * <code>string uuid = 2;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string value = 3;</code>
   */
  java.lang.String getValue();
  /**
   * <code>string value = 3;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string fieldGroupType = 5;</code>
   */
  java.lang.String getFieldGroupType();
  /**
   * <code>string fieldGroupType = 5;</code>
   */
  com.google.protobuf.ByteString
      getFieldGroupTypeBytes();

  /**
   * <code>repeated .dictionary.FieldCondition conditions = 6;</code>
   */
  java.util.List<org.spin.grpc.util.FieldCondition> 
      getConditionsList();
  /**
   * <code>repeated .dictionary.FieldCondition conditions = 6;</code>
   */
  org.spin.grpc.util.FieldCondition getConditions(int index);
  /**
   * <code>repeated .dictionary.FieldCondition conditions = 6;</code>
   */
  int getConditionsCount();
  /**
   * <code>repeated .dictionary.FieldCondition conditions = 6;</code>
   */
  java.util.List<? extends org.spin.grpc.util.FieldConditionOrBuilder> 
      getConditionsOrBuilderList();
  /**
   * <code>repeated .dictionary.FieldCondition conditions = 6;</code>
   */
  org.spin.grpc.util.FieldConditionOrBuilder getConditionsOrBuilder(
      int index);
}