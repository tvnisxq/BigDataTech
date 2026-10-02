// ORM class for table 'patients'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Oct 02 01:59:15 IST 2026
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class patients extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("patient_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        patients.this.patient_id = (String)value;
      }
    });
    setters.put("patient_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        patients.this.patient_name = (String)value;
      }
    });
    setters.put("gender", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        patients.this.gender = (String)value;
      }
    });
    setters.put("age", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        patients.this.age = (Integer)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        patients.this.city = (String)value;
      }
    });
  }
  public patients() {
    init0();
  }
  private String patient_id;
  public String get_patient_id() {
    return patient_id;
  }
  public void set_patient_id(String patient_id) {
    this.patient_id = patient_id;
  }
  public patients with_patient_id(String patient_id) {
    this.patient_id = patient_id;
    return this;
  }
  private String patient_name;
  public String get_patient_name() {
    return patient_name;
  }
  public void set_patient_name(String patient_name) {
    this.patient_name = patient_name;
  }
  public patients with_patient_name(String patient_name) {
    this.patient_name = patient_name;
    return this;
  }
  private String gender;
  public String get_gender() {
    return gender;
  }
  public void set_gender(String gender) {
    this.gender = gender;
  }
  public patients with_gender(String gender) {
    this.gender = gender;
    return this;
  }
  private Integer age;
  public Integer get_age() {
    return age;
  }
  public void set_age(Integer age) {
    this.age = age;
  }
  public patients with_age(Integer age) {
    this.age = age;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public patients with_city(String city) {
    this.city = city;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof patients)) {
      return false;
    }
    patients that = (patients) o;
    boolean equal = true;
    equal = equal && (this.patient_id == null ? that.patient_id == null : this.patient_id.equals(that.patient_id));
    equal = equal && (this.patient_name == null ? that.patient_name == null : this.patient_name.equals(that.patient_name));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof patients)) {
      return false;
    }
    patients that = (patients) o;
    boolean equal = true;
    equal = equal && (this.patient_id == null ? that.patient_id == null : this.patient_id.equals(that.patient_id));
    equal = equal && (this.patient_name == null ? that.patient_name == null : this.patient_name.equals(that.patient_name));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.patient_id = JdbcWritableBridge.readString(1, __dbResults);
    this.patient_name = JdbcWritableBridge.readString(2, __dbResults);
    this.gender = JdbcWritableBridge.readString(3, __dbResults);
    this.age = JdbcWritableBridge.readInteger(4, __dbResults);
    this.city = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.patient_id = JdbcWritableBridge.readString(1, __dbResults);
    this.patient_name = JdbcWritableBridge.readString(2, __dbResults);
    this.gender = JdbcWritableBridge.readString(3, __dbResults);
    this.age = JdbcWritableBridge.readInteger(4, __dbResults);
    this.city = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(patient_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(patient_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gender, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(age, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(city, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(patient_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(patient_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gender, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(age, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(city, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.patient_id = null;
    } else {
    this.patient_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.patient_name = null;
    } else {
    this.patient_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gender = null;
    } else {
    this.gender = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.age = null;
    } else {
    this.age = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.patient_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, patient_id);
    }
    if (null == this.patient_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, patient_name);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gender);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.age);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.patient_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, patient_id);
    }
    if (null == this.patient_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, patient_name);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gender);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.age);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(patient_id==null?"null":patient_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(patient_name==null?"null":patient_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":"" + age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(patient_id==null?"null":patient_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(patient_name==null?"null":patient_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":"" + age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.patient_id = null; } else {
      this.patient_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.patient_name = null; } else {
      this.patient_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.gender = null; } else {
      this.gender = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.age = null; } else {
      this.age = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.patient_id = null; } else {
      this.patient_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.patient_name = null; } else {
      this.patient_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.gender = null; } else {
      this.gender = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.age = null; } else {
      this.age = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    patients o = (patients) super.clone();
    return o;
  }

  public void clone0(patients o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("patient_id", this.patient_id);
    __sqoop$field_map.put("patient_name", this.patient_name);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("city", this.city);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("patient_id", this.patient_id);
    __sqoop$field_map.put("patient_name", this.patient_name);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("city", this.city);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
