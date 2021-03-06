// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: weave/trait/pairing.proto

package weave.trait.pairing;

public final class Pairing {
  private Pairing() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ConfigurationDoneTraitOrBuilder extends
      // @@protoc_insertion_point(interface_extends:weave.trait.pairing.ConfigurationDoneTrait)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool appConfigurationComplete = 1;</code>
     * @return The appConfigurationComplete.
     */
    boolean getAppConfigurationComplete();

    /**
     * <code>bool deviceReady = 2;</code>
     * @return The deviceReady.
     */
    boolean getDeviceReady();
  }
  /**
   * Protobuf type {@code weave.trait.pairing.ConfigurationDoneTrait}
   */
  public static final class ConfigurationDoneTrait extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:weave.trait.pairing.ConfigurationDoneTrait)
      ConfigurationDoneTraitOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ConfigurationDoneTrait.newBuilder() to construct.
    private ConfigurationDoneTrait(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ConfigurationDoneTrait() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ConfigurationDoneTrait();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ConfigurationDoneTrait(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              appConfigurationComplete_ = input.readBool();
              break;
            }
            case 16: {

              deviceReady_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return weave.trait.pairing.Pairing.internal_static_weave_trait_pairing_ConfigurationDoneTrait_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return weave.trait.pairing.Pairing.internal_static_weave_trait_pairing_ConfigurationDoneTrait_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              weave.trait.pairing.Pairing.ConfigurationDoneTrait.class, weave.trait.pairing.Pairing.ConfigurationDoneTrait.Builder.class);
    }

    public static final int APPCONFIGURATIONCOMPLETE_FIELD_NUMBER = 1;
    private boolean appConfigurationComplete_;
    /**
     * <code>bool appConfigurationComplete = 1;</code>
     * @return The appConfigurationComplete.
     */
    @java.lang.Override
    public boolean getAppConfigurationComplete() {
      return appConfigurationComplete_;
    }

    public static final int DEVICEREADY_FIELD_NUMBER = 2;
    private boolean deviceReady_;
    /**
     * <code>bool deviceReady = 2;</code>
     * @return The deviceReady.
     */
    @java.lang.Override
    public boolean getDeviceReady() {
      return deviceReady_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (appConfigurationComplete_ != false) {
        output.writeBool(1, appConfigurationComplete_);
      }
      if (deviceReady_ != false) {
        output.writeBool(2, deviceReady_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (appConfigurationComplete_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, appConfigurationComplete_);
      }
      if (deviceReady_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, deviceReady_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof weave.trait.pairing.Pairing.ConfigurationDoneTrait)) {
        return super.equals(obj);
      }
      weave.trait.pairing.Pairing.ConfigurationDoneTrait other = (weave.trait.pairing.Pairing.ConfigurationDoneTrait) obj;

      if (getAppConfigurationComplete()
          != other.getAppConfigurationComplete()) return false;
      if (getDeviceReady()
          != other.getDeviceReady()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + APPCONFIGURATIONCOMPLETE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAppConfigurationComplete());
      hash = (37 * hash) + DEVICEREADY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDeviceReady());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(weave.trait.pairing.Pairing.ConfigurationDoneTrait prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code weave.trait.pairing.ConfigurationDoneTrait}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:weave.trait.pairing.ConfigurationDoneTrait)
        weave.trait.pairing.Pairing.ConfigurationDoneTraitOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return weave.trait.pairing.Pairing.internal_static_weave_trait_pairing_ConfigurationDoneTrait_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return weave.trait.pairing.Pairing.internal_static_weave_trait_pairing_ConfigurationDoneTrait_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                weave.trait.pairing.Pairing.ConfigurationDoneTrait.class, weave.trait.pairing.Pairing.ConfigurationDoneTrait.Builder.class);
      }

      // Construct using weave.trait.pairing.Pairing.ConfigurationDoneTrait.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        appConfigurationComplete_ = false;

        deviceReady_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return weave.trait.pairing.Pairing.internal_static_weave_trait_pairing_ConfigurationDoneTrait_descriptor;
      }

      @java.lang.Override
      public weave.trait.pairing.Pairing.ConfigurationDoneTrait getDefaultInstanceForType() {
        return weave.trait.pairing.Pairing.ConfigurationDoneTrait.getDefaultInstance();
      }

      @java.lang.Override
      public weave.trait.pairing.Pairing.ConfigurationDoneTrait build() {
        weave.trait.pairing.Pairing.ConfigurationDoneTrait result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public weave.trait.pairing.Pairing.ConfigurationDoneTrait buildPartial() {
        weave.trait.pairing.Pairing.ConfigurationDoneTrait result = new weave.trait.pairing.Pairing.ConfigurationDoneTrait(this);
        result.appConfigurationComplete_ = appConfigurationComplete_;
        result.deviceReady_ = deviceReady_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof weave.trait.pairing.Pairing.ConfigurationDoneTrait) {
          return mergeFrom((weave.trait.pairing.Pairing.ConfigurationDoneTrait)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(weave.trait.pairing.Pairing.ConfigurationDoneTrait other) {
        if (other == weave.trait.pairing.Pairing.ConfigurationDoneTrait.getDefaultInstance()) return this;
        if (other.getAppConfigurationComplete() != false) {
          setAppConfigurationComplete(other.getAppConfigurationComplete());
        }
        if (other.getDeviceReady() != false) {
          setDeviceReady(other.getDeviceReady());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        weave.trait.pairing.Pairing.ConfigurationDoneTrait parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (weave.trait.pairing.Pairing.ConfigurationDoneTrait) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean appConfigurationComplete_ ;
      /**
       * <code>bool appConfigurationComplete = 1;</code>
       * @return The appConfigurationComplete.
       */
      @java.lang.Override
      public boolean getAppConfigurationComplete() {
        return appConfigurationComplete_;
      }
      /**
       * <code>bool appConfigurationComplete = 1;</code>
       * @param value The appConfigurationComplete to set.
       * @return This builder for chaining.
       */
      public Builder setAppConfigurationComplete(boolean value) {
        
        appConfigurationComplete_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool appConfigurationComplete = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAppConfigurationComplete() {
        
        appConfigurationComplete_ = false;
        onChanged();
        return this;
      }

      private boolean deviceReady_ ;
      /**
       * <code>bool deviceReady = 2;</code>
       * @return The deviceReady.
       */
      @java.lang.Override
      public boolean getDeviceReady() {
        return deviceReady_;
      }
      /**
       * <code>bool deviceReady = 2;</code>
       * @param value The deviceReady to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceReady(boolean value) {
        
        deviceReady_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool deviceReady = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeviceReady() {
        
        deviceReady_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:weave.trait.pairing.ConfigurationDoneTrait)
    }

    // @@protoc_insertion_point(class_scope:weave.trait.pairing.ConfigurationDoneTrait)
    private static final weave.trait.pairing.Pairing.ConfigurationDoneTrait DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new weave.trait.pairing.Pairing.ConfigurationDoneTrait();
    }

    public static weave.trait.pairing.Pairing.ConfigurationDoneTrait getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ConfigurationDoneTrait>
        PARSER = new com.google.protobuf.AbstractParser<ConfigurationDoneTrait>() {
      @java.lang.Override
      public ConfigurationDoneTrait parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConfigurationDoneTrait(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ConfigurationDoneTrait> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ConfigurationDoneTrait> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public weave.trait.pairing.Pairing.ConfigurationDoneTrait getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_weave_trait_pairing_ConfigurationDoneTrait_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_weave_trait_pairing_ConfigurationDoneTrait_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031weave/trait/pairing.proto\022\023weave.trait" +
      ".pairing\"O\n\026ConfigurationDoneTrait\022 \n\030ap" +
      "pConfigurationComplete\030\001 \001(\010\022\023\n\013deviceRe" +
      "ady\030\002 \001(\010b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_weave_trait_pairing_ConfigurationDoneTrait_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_weave_trait_pairing_ConfigurationDoneTrait_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_weave_trait_pairing_ConfigurationDoneTrait_descriptor,
        new java.lang.String[] { "AppConfigurationComplete", "DeviceReady", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
