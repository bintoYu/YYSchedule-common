/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.binto.YYSchedule.common.rpc.service.notify;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-06-11")
public class NodeListenService {

  public interface Iface {

    /**
     * execute nodeCommand
     * @param	nodeCommand
     * @return	succeed or false
     * 
     * @param nodeCommand
     */
    public int managerNode(com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void managerNode(com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand, org.apache.thrift.async.AsyncMethodCallback<java.lang.Integer> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public int managerNode(com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand) throws org.apache.thrift.TException
    {
      send_managerNode(nodeCommand);
      return recv_managerNode();
    }

    public void send_managerNode(com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand) throws org.apache.thrift.TException
    {
      managerNode_args args = new managerNode_args();
      args.setNodeCommand(nodeCommand);
      sendBase("managerNode", args);
    }

    public int recv_managerNode() throws org.apache.thrift.TException
    {
      managerNode_result result = new managerNode_result();
      receiveBase(result, "managerNode");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "managerNode failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void managerNode(com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand, org.apache.thrift.async.AsyncMethodCallback<java.lang.Integer> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      managerNode_call method_call = new managerNode_call(nodeCommand, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class managerNode_call extends org.apache.thrift.async.TAsyncMethodCall<java.lang.Integer> {
      private com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand;
      public managerNode_call(com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand, org.apache.thrift.async.AsyncMethodCallback<java.lang.Integer> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.nodeCommand = nodeCommand;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("managerNode", org.apache.thrift.protocol.TMessageType.CALL, 0));
        managerNode_args args = new managerNode_args();
        args.setNodeCommand(nodeCommand);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public java.lang.Integer getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new java.lang.IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_managerNode();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> java.util.Map<java.lang.String,  org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("managerNode", new managerNode());
      return processMap;
    }

    public static class managerNode<I extends Iface> extends org.apache.thrift.ProcessFunction<I, managerNode_args> {
      public managerNode() {
        super("managerNode");
      }

      public managerNode_args getEmptyArgsInstance() {
        return new managerNode_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public managerNode_result getResult(I iface, managerNode_args args) throws org.apache.thrift.TException {
        managerNode_result result = new managerNode_result();
        result.success = iface.managerNode(args.nodeCommand);
        result.setSuccessIsSet(true);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("managerNode", new managerNode());
      return processMap;
    }

    public static class managerNode<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, managerNode_args, java.lang.Integer> {
      public managerNode() {
        super("managerNode");
      }

      public managerNode_args getEmptyArgsInstance() {
        return new managerNode_args();
      }

      public org.apache.thrift.async.AsyncMethodCallback<java.lang.Integer> getResultHandler(final org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new org.apache.thrift.async.AsyncMethodCallback<java.lang.Integer>() { 
          public void onComplete(java.lang.Integer o) {
            managerNode_result result = new managerNode_result();
            result.success = o;
            result.setSuccessIsSet(true);
            try {
              fcall.sendResponse(fb, result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
            } catch (org.apache.thrift.transport.TTransportException e) {
              _LOGGER.error("TTransportException writing to internal frame buffer", e);
              fb.close();
            } catch (java.lang.Exception e) {
              _LOGGER.error("Exception writing to internal frame buffer", e);
              onError(e);
            }
          }
          public void onError(java.lang.Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TSerializable msg;
            managerNode_result result = new managerNode_result();
            if (e instanceof org.apache.thrift.transport.TTransportException) {
              _LOGGER.error("TTransportException inside handler", e);
              fb.close();
              return;
            } else if (e instanceof org.apache.thrift.TApplicationException) {
              _LOGGER.error("TApplicationException inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TApplicationException)e;
            } else {
              _LOGGER.error("Exception inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
            } catch (java.lang.Exception ex) {
              _LOGGER.error("Exception writing to internal frame buffer", ex);
              fb.close();
            }
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, managerNode_args args, org.apache.thrift.async.AsyncMethodCallback<java.lang.Integer> resultHandler) throws org.apache.thrift.TException {
        iface.managerNode(args.nodeCommand,resultHandler);
      }
    }

  }

  public static class managerNode_args implements org.apache.thrift.TBase<managerNode_args, managerNode_args._Fields>, java.io.Serializable, Cloneable, Comparable<managerNode_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("managerNode_args");

    private static final org.apache.thrift.protocol.TField NODE_COMMAND_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeCommand", org.apache.thrift.protocol.TType.I32, (short)1);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new managerNode_argsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new managerNode_argsTupleSchemeFactory();

    /**
     * 
     * @see com.binto.YYSchedule.common.rpc.domain.node.NodeCommand
     */
    public com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      /**
       * 
       * @see com.binto.YYSchedule.common.rpc.domain.node.NodeCommand
       */
      NODE_COMMAND((short)1, "nodeCommand");

      private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

      static {
        for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // NODE_COMMAND
            return NODE_COMMAND;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(java.lang.String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final java.lang.String _fieldName;

      _Fields(short thriftId, java.lang.String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public java.lang.String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.NODE_COMMAND, new org.apache.thrift.meta_data.FieldMetaData("nodeCommand", org.apache.thrift.TFieldRequirementType.REQUIRED, 
          new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.binto.YYSchedule.common.rpc.domain.node.NodeCommand.class)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(managerNode_args.class, metaDataMap);
    }

    public managerNode_args() {
    }

    public managerNode_args(
      com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand)
    {
      this();
      this.nodeCommand = nodeCommand;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public managerNode_args(managerNode_args other) {
      if (other.isSetNodeCommand()) {
        this.nodeCommand = other.nodeCommand;
      }
    }

    public managerNode_args deepCopy() {
      return new managerNode_args(this);
    }

    @Override
    public void clear() {
      this.nodeCommand = null;
    }

    /**
     * 
     * @see com.binto.YYSchedule.common.rpc.domain.node.NodeCommand
     */
    public com.binto.YYSchedule.common.rpc.domain.node.NodeCommand getNodeCommand() {
      return this.nodeCommand;
    }

    /**
     * 
     * @see com.binto.YYSchedule.common.rpc.domain.node.NodeCommand
     */
    public managerNode_args setNodeCommand(com.binto.YYSchedule.common.rpc.domain.node.NodeCommand nodeCommand) {
      this.nodeCommand = nodeCommand;
      return this;
    }

    public void unsetNodeCommand() {
      this.nodeCommand = null;
    }

    /** Returns true if field nodeCommand is set (has been assigned a value) and false otherwise */
    public boolean isSetNodeCommand() {
      return this.nodeCommand != null;
    }

    public void setNodeCommandIsSet(boolean value) {
      if (!value) {
        this.nodeCommand = null;
      }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      case NODE_COMMAND:
        if (value == null) {
          unsetNodeCommand();
        } else {
          setNodeCommand((com.binto.YYSchedule.common.rpc.domain.node.NodeCommand)value);
        }
        break;

      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case NODE_COMMAND:
        return getNodeCommand();

      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      case NODE_COMMAND:
        return isSetNodeCommand();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof managerNode_args)
        return this.equals((managerNode_args)that);
      return false;
    }

    public boolean equals(managerNode_args that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_nodeCommand = true && this.isSetNodeCommand();
      boolean that_present_nodeCommand = true && that.isSetNodeCommand();
      if (this_present_nodeCommand || that_present_nodeCommand) {
        if (!(this_present_nodeCommand && that_present_nodeCommand))
          return false;
        if (!this.nodeCommand.equals(that.nodeCommand))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetNodeCommand()) ? 131071 : 524287);
      if (isSetNodeCommand())
        hashCode = hashCode * 8191 + nodeCommand.getValue();

      return hashCode;
    }

    @Override
    public int compareTo(managerNode_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.valueOf(isSetNodeCommand()).compareTo(other.isSetNodeCommand());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetNodeCommand()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeCommand, other.nodeCommand);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      scheme(oprot).write(oprot, this);
    }

    @Override
    public java.lang.String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder("managerNode_args(");
      boolean first = true;

      sb.append("nodeCommand:");
      if (this.nodeCommand == null) {
        sb.append("null");
      } else {
        sb.append(this.nodeCommand);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      if (nodeCommand == null) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodeCommand' was not present! Struct: " + toString());
      }
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class managerNode_argsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public managerNode_argsStandardScheme getScheme() {
        return new managerNode_argsStandardScheme();
      }
    }

    private static class managerNode_argsStandardScheme extends org.apache.thrift.scheme.StandardScheme<managerNode_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, managerNode_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // NODE_COMMAND
              if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                struct.nodeCommand = com.binto.YYSchedule.common.rpc.domain.node.NodeCommand.findByValue(iprot.readI32());
                struct.setNodeCommandIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, managerNode_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.nodeCommand != null) {
          oprot.writeFieldBegin(NODE_COMMAND_FIELD_DESC);
          oprot.writeI32(struct.nodeCommand.getValue());
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class managerNode_argsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public managerNode_argsTupleScheme getScheme() {
        return new managerNode_argsTupleScheme();
      }
    }

    private static class managerNode_argsTupleScheme extends org.apache.thrift.scheme.TupleScheme<managerNode_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, managerNode_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        oprot.writeI32(struct.nodeCommand.getValue());
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, managerNode_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        struct.nodeCommand = com.binto.YYSchedule.common.rpc.domain.node.NodeCommand.findByValue(iprot.readI32());
        struct.setNodeCommandIsSet(true);
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  public static class managerNode_result implements org.apache.thrift.TBase<managerNode_result, managerNode_result._Fields>, java.io.Serializable, Cloneable, Comparable<managerNode_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("managerNode_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.I32, (short)0);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new managerNode_resultStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new managerNode_resultTupleSchemeFactory();

    public int success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

      private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

      static {
        for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(java.lang.String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final java.lang.String _fieldName;

      _Fields(short thriftId, java.lang.String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public java.lang.String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    private static final int __SUCCESS_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(managerNode_result.class, metaDataMap);
    }

    public managerNode_result() {
    }

    public managerNode_result(
      int success)
    {
      this();
      this.success = success;
      setSuccessIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public managerNode_result(managerNode_result other) {
      __isset_bitfield = other.__isset_bitfield;
      this.success = other.success;
    }

    public managerNode_result deepCopy() {
      return new managerNode_result(this);
    }

    @Override
    public void clear() {
      setSuccessIsSet(false);
      this.success = 0;
    }

    public int getSuccess() {
      return this.success;
    }

    public managerNode_result setSuccess(int success) {
      this.success = success;
      setSuccessIsSet(true);
      return this;
    }

    public void unsetSuccess() {
      __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    public void setSuccessIsSet(boolean value) {
      __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((java.lang.Integer)value);
        }
        break;

      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof managerNode_result)
        return this.equals((managerNode_result)that);
      return false;
    }

    public boolean equals(managerNode_result that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      boolean this_present_success = true;
      boolean that_present_success = true;
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (this.success != that.success)
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + success;

      return hashCode;
    }

    @Override
    public int compareTo(managerNode_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      scheme(oprot).write(oprot, this);
      }

    @Override
    public java.lang.String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder("managerNode_result(");
      boolean first = true;

      sb.append("success:");
      sb.append(this.success);
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
      try {
        // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
        __isset_bitfield = 0;
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class managerNode_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public managerNode_resultStandardScheme getScheme() {
        return new managerNode_resultStandardScheme();
      }
    }

    private static class managerNode_resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<managerNode_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, managerNode_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                struct.success = iprot.readI32();
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, managerNode_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.isSetSuccess()) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          oprot.writeI32(struct.success);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class managerNode_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public managerNode_resultTupleScheme getScheme() {
        return new managerNode_resultTupleScheme();
      }
    }

    private static class managerNode_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<managerNode_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, managerNode_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          oprot.writeI32(struct.success);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, managerNode_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = iprot.readI32();
          struct.setSuccessIsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

}
