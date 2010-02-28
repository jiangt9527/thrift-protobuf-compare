/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package serializers.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

/**
 * Some comment...
 */
public class Image implements TBase<Image._Fields>, java.io.Serializable, Cloneable, Comparable<Image> {
  private static final TStruct STRUCT_DESC = new TStruct("Image");

  private static final TField URI_FIELD_DESC = new TField("uri", TType.STRING, (short)1);
  private static final TField TITLE_FIELD_DESC = new TField("title", TType.STRING, (short)2);
  private static final TField WIDTH_FIELD_DESC = new TField("width", TType.I32, (short)3);
  private static final TField HEIGHT_FIELD_DESC = new TField("height", TType.I32, (short)4);
  private static final TField SIZE_FIELD_DESC = new TField("size", TType.I32, (short)5);

  private String uri;
  private String title;
  private int width;
  private int height;
  private Size size;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    URI((short)1, "uri"),
    TITLE((short)2, "title"),
    WIDTH((short)3, "width"),
    HEIGHT((short)4, "height"),
    /**
     * 
     * @see Size
     */
    SIZE((short)5, "size");

    private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byId.put((int)field._thriftId, field);
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      return byId.get(fieldId);
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WIDTH_ISSET_ID = 0;
  private static final int __HEIGHT_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.URI, new FieldMetaData("uri", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.TITLE, new FieldMetaData("title", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.WIDTH, new FieldMetaData("width", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    put(_Fields.HEIGHT, new FieldMetaData("height", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    put(_Fields.SIZE, new FieldMetaData("size", TFieldRequirementType.OPTIONAL, 
        new EnumMetaData(TType.ENUM, Size.class)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Image.class, metaDataMap);
  }

  public Image() {
  }

  public Image(
    String uri)
  {
    this();
    this.uri = uri;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Image(Image other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetUri()) {
      this.uri = other.uri;
    }
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    this.width = other.width;
    this.height = other.height;
    if (other.isSetSize()) {
      this.size = other.size;
    }
  }

  public Image deepCopy() {
    return new Image(this);
  }

  @Deprecated
  public Image clone() {
    return new Image(this);
  }

  public String getUri() {
    return this.uri;
  }

  public Image setUri(String uri) {
    this.uri = uri;
    return this;
  }

  public void unsetUri() {
    this.uri = null;
  }

  /** Returns true if field uri is set (has been asigned a value) and false otherwise */
  public boolean isSetUri() {
    return this.uri != null;
  }

  public void setUriIsSet(boolean value) {
    if (!value) {
      this.uri = null;
    }
  }

  public String getTitle() {
    return this.title;
  }

  public Image setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been asigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public int getWidth() {
    return this.width;
  }

  public Image setWidth(int width) {
    this.width = width;
    setWidthIsSet(true);
    return this;
  }

  public void unsetWidth() {
    __isset_bit_vector.clear(__WIDTH_ISSET_ID);
  }

  /** Returns true if field width is set (has been asigned a value) and false otherwise */
  public boolean isSetWidth() {
    return __isset_bit_vector.get(__WIDTH_ISSET_ID);
  }

  public void setWidthIsSet(boolean value) {
    __isset_bit_vector.set(__WIDTH_ISSET_ID, value);
  }

  public int getHeight() {
    return this.height;
  }

  public Image setHeight(int height) {
    this.height = height;
    setHeightIsSet(true);
    return this;
  }

  public void unsetHeight() {
    __isset_bit_vector.clear(__HEIGHT_ISSET_ID);
  }

  /** Returns true if field height is set (has been asigned a value) and false otherwise */
  public boolean isSetHeight() {
    return __isset_bit_vector.get(__HEIGHT_ISSET_ID);
  }

  public void setHeightIsSet(boolean value) {
    __isset_bit_vector.set(__HEIGHT_ISSET_ID, value);
  }

  /**
   * 
   * @see Size
   */
  public Size getSize() {
    return this.size;
  }

  /**
   * 
   * @see Size
   */
  public Image setSize(Size size) {
    this.size = size;
    return this;
  }

  public void unsetSize() {
    this.size = null;
  }

  /** Returns true if field size is set (has been asigned a value) and false otherwise */
  public boolean isSetSize() {
    return this.size != null;
  }

  public void setSizeIsSet(boolean value) {
    if (!value) {
      this.size = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case URI:
      if (value == null) {
        unsetUri();
      } else {
        setUri((String)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case WIDTH:
      if (value == null) {
        unsetWidth();
      } else {
        setWidth((Integer)value);
      }
      break;

    case HEIGHT:
      if (value == null) {
        unsetHeight();
      } else {
        setHeight((Integer)value);
      }
      break;

    case SIZE:
      if (value == null) {
        unsetSize();
      } else {
        setSize((Size)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case URI:
      return getUri();

    case TITLE:
      return getTitle();

    case WIDTH:
      return new Integer(getWidth());

    case HEIGHT:
      return new Integer(getHeight());

    case SIZE:
      return getSize();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case URI:
      return isSetUri();
    case TITLE:
      return isSetTitle();
    case WIDTH:
      return isSetWidth();
    case HEIGHT:
      return isSetHeight();
    case SIZE:
      return isSetSize();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Image)
      return this.equals((Image)that);
    return false;
  }

  public boolean equals(Image that) {
    if (that == null)
      return false;

    boolean this_present_uri = true && this.isSetUri();
    boolean that_present_uri = true && that.isSetUri();
    if (this_present_uri || that_present_uri) {
      if (!(this_present_uri && that_present_uri))
        return false;
      if (!this.uri.equals(that.uri))
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_width = true && this.isSetWidth();
    boolean that_present_width = true && that.isSetWidth();
    if (this_present_width || that_present_width) {
      if (!(this_present_width && that_present_width))
        return false;
      if (this.width != that.width)
        return false;
    }

    boolean this_present_height = true && this.isSetHeight();
    boolean that_present_height = true && that.isSetHeight();
    if (this_present_height || that_present_height) {
      if (!(this_present_height && that_present_height))
        return false;
      if (this.height != that.height)
        return false;
    }

    boolean this_present_size = true && this.isSetSize();
    boolean that_present_size = true && that.isSetSize();
    if (this_present_size || that_present_size) {
      if (!(this_present_size && that_present_size))
        return false;
      if (!this.size.equals(that.size))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_uri = true && (isSetUri());
    builder.append(present_uri);
    if (present_uri)
      builder.append(uri);

    boolean present_title = true && (isSetTitle());
    builder.append(present_title);
    if (present_title)
      builder.append(title);

    boolean present_width = true && (isSetWidth());
    builder.append(present_width);
    if (present_width)
      builder.append(width);

    boolean present_height = true && (isSetHeight());
    builder.append(present_height);
    if (present_height)
      builder.append(height);

    boolean present_size = true && (isSetSize());
    builder.append(present_size);
    if (present_size)
      builder.append(size.getValue());

    return builder.toHashCode();
  }

  public int compareTo(Image other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Image typedOther = (Image)other;

    lastComparison = Boolean.valueOf(isSetUri()).compareTo(isSetUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(uri, typedOther.uri);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(title, typedOther.title);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetWidth()).compareTo(isSetWidth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(width, typedOther.width);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetHeight()).compareTo(isSetHeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(height, typedOther.height);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSize()).compareTo(isSetSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(size, typedOther.size);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      _Fields fieldId = _Fields.findByThriftId(field.id);
      if (fieldId == null) {
        TProtocolUtil.skip(iprot, field.type);
      } else {
        switch (fieldId) {
          case URI:
            if (field.type == TType.STRING) {
              this.uri = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case TITLE:
            if (field.type == TType.STRING) {
              this.title = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case WIDTH:
            if (field.type == TType.I32) {
              this.width = iprot.readI32();
              setWidthIsSet(true);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case HEIGHT:
            if (field.type == TType.I32) {
              this.height = iprot.readI32();
              setHeightIsSet(true);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case SIZE:
            if (field.type == TType.I32) {
              this.size = Size.findByValue(iprot.readI32());
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
        }
        iprot.readFieldEnd();
      }
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.uri != null) {
      oprot.writeFieldBegin(URI_FIELD_DESC);
      oprot.writeString(this.uri);
      oprot.writeFieldEnd();
    }
    if (this.title != null) {
      if (isSetTitle()) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(this.title);
        oprot.writeFieldEnd();
      }
    }
    if (isSetWidth()) {
      oprot.writeFieldBegin(WIDTH_FIELD_DESC);
      oprot.writeI32(this.width);
      oprot.writeFieldEnd();
    }
    if (isSetHeight()) {
      oprot.writeFieldBegin(HEIGHT_FIELD_DESC);
      oprot.writeI32(this.height);
      oprot.writeFieldEnd();
    }
    if (this.size != null) {
      if (isSetSize()) {
        oprot.writeFieldBegin(SIZE_FIELD_DESC);
        oprot.writeI32(this.size.getValue());
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Image(");
    boolean first = true;

    sb.append("uri:");
    if (this.uri == null) {
      sb.append("null");
    } else {
      sb.append(this.uri);
    }
    first = false;
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetWidth()) {
      if (!first) sb.append(", ");
      sb.append("width:");
      sb.append(this.width);
      first = false;
    }
    if (isSetHeight()) {
      if (!first) sb.append(", ");
      sb.append("height:");
      sb.append(this.height);
      first = false;
    }
    if (isSetSize()) {
      if (!first) sb.append(", ");
      sb.append("size:");
      if (this.size == null) {
        sb.append("null");
      } else {
        String size_name = size.name();
        if (size_name != null) {
          sb.append(size_name);
          sb.append(" (");
        }
        sb.append(this.size);
        if (size_name != null) {
          sb.append(")");
        }
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
