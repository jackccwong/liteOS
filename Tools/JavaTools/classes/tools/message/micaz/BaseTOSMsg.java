/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'BaseTOSMsg'
 * message type.
 */

package tools.message.micaz;

public class BaseTOSMsg extends tools.message.TOSMsg {

	/** The default size of this message type in bytes. */
	public static final int DEFAULT_MESSAGE_SIZE = 46;

	/** The Active Message type associated with this message. */
	public static final int AM_TYPE = -1;

	/** Create a new BaseTOSMsg of size 46. */
	public BaseTOSMsg() {
		super(DEFAULT_MESSAGE_SIZE);
		amTypeSet(AM_TYPE);
	}

	/** Create a new BaseTOSMsg of the given data_length. */
	public BaseTOSMsg(int data_length) {
		super(data_length);
		amTypeSet(AM_TYPE);
	}

	/**
	 * Create a new BaseTOSMsg with the given data_length and base offset.
	 */
	public BaseTOSMsg(int data_length, int base_offset) {
		super(data_length, base_offset);
		amTypeSet(AM_TYPE);
	}

	/**
	 * Create a new BaseTOSMsg using the given byte array as backing store.
	 */
	public BaseTOSMsg(byte[] data) {
		super(data);
		amTypeSet(AM_TYPE);
	}

	/**
	 * Create a new BaseTOSMsg using the given byte array as backing store, with
	 * the given base offset.
	 */
	public BaseTOSMsg(byte[] data, int base_offset) {
		super(data, base_offset);
		amTypeSet(AM_TYPE);
	}

	/**
	 * Create a new BaseTOSMsg using the given byte array as backing store, with
	 * the given base offset and data length.
	 */
	public BaseTOSMsg(byte[] data, int base_offset, int data_length) {
		super(data, base_offset, data_length);
		amTypeSet(AM_TYPE);
	}

	/**
	 * Create a new BaseTOSMsg embedded in the given message at the given base
	 * offset.
	 */
	public BaseTOSMsg(tools.message.Message msg, int base_offset) {
		super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
		amTypeSet(AM_TYPE);
	}

	/**
	 * Create a new BaseTOSMsg embedded in the given message at the given base
	 * offset and length.
	 */
	public BaseTOSMsg(tools.message.Message msg, int base_offset,
			int data_length) {
		super(msg, base_offset, data_length);
		amTypeSet(AM_TYPE);
	}

	/**
	 * /* Return a String representation of this message. Includes the message
	 * type name and the non-indexed field values.
	 */
	public String toString() {
		String s = "Message <BaseTOSMsg> \n";
		try {
			s += "  [length=0x" + Long.toHexString(get_length()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [fcfhi=0x" + Long.toHexString(get_fcfhi()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [fcflo=0x" + Long.toHexString(get_fcflo()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [dsn=0x" + Long.toHexString(get_dsn()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [destpan=0x" + Long.toHexString(get_destpan()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [addr=0x" + Long.toHexString(get_addr()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [type=0x" + Long.toHexString(get_type()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [group=0x" + Long.toHexString(get_group()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [data=";
			for (int i = 0; i < 29; i++) {
				s += "0x" + Long.toHexString(getElement_data(i) & 0xff) + " ";
			}
			s += "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [crc=0x" + Long.toHexString(get_crc()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [strength=0x" + Long.toHexString(get_strength()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [lqi=0x" + Long.toHexString(get_lqi()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [ack=0x" + Long.toHexString(get_ack()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		try {
			s += "  [time=0x" + Long.toHexString(get_time()) + "]\n";
		} catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */
		}
		return s;
	}

	// Message-type-specific access methods appear below.

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: length
	// Field type: short, unsigned
	// Offset (bits): 0
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'length' is signed (false).
	 */
	public static boolean isSigned_length() {
		return false;
	}

	/**
	 * Return whether the field 'length' is an array (false).
	 */
	public static boolean isArray_length() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'length'
	 */
	public int offset_length() {
		return (0 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'length'
	 */
	public static int offsetBits_length() {
		return 0;
	}

	/**
	 * Return the value (as a short) of the field 'length'
	 */
	public short get_length() {
		return (short) getUIntElement(offsetBits_length(), 8);
	}

	/**
	 * Set the value of the field 'length'
	 */
	public void set_length(short value) {
		setUIntElement(offsetBits_length(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'length'
	 */
	public static int size_length() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'length'
	 */
	public static int sizeBits_length() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: fcfhi
	// Field type: short, unsigned
	// Offset (bits): 8
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'fcfhi' is signed (false).
	 */
	public static boolean isSigned_fcfhi() {
		return false;
	}

	/**
	 * Return whether the field 'fcfhi' is an array (false).
	 */
	public static boolean isArray_fcfhi() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'fcfhi'
	 */
	public static int offset_fcfhi() {
		return (8 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'fcfhi'
	 */
	public static int offsetBits_fcfhi() {
		return 8;
	}

	/**
	 * Return the value (as a short) of the field 'fcfhi'
	 */
	public short get_fcfhi() {
		return (short) getUIntElement(offsetBits_fcfhi(), 8);
	}

	/**
	 * Set the value of the field 'fcfhi'
	 */
	public void set_fcfhi(short value) {
		setUIntElement(offsetBits_fcfhi(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'fcfhi'
	 */
	public static int size_fcfhi() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'fcfhi'
	 */
	public static int sizeBits_fcfhi() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: fcflo
	// Field type: short, unsigned
	// Offset (bits): 16
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'fcflo' is signed (false).
	 */
	public static boolean isSigned_fcflo() {
		return false;
	}

	/**
	 * Return whether the field 'fcflo' is an array (false).
	 */
	public static boolean isArray_fcflo() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'fcflo'
	 */
	public static int offset_fcflo() {
		return (16 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'fcflo'
	 */
	public static int offsetBits_fcflo() {
		return 16;
	}

	/**
	 * Return the value (as a short) of the field 'fcflo'
	 */
	public short get_fcflo() {
		return (short) getUIntElement(offsetBits_fcflo(), 8);
	}

	/**
	 * Set the value of the field 'fcflo'
	 */
	public void set_fcflo(short value) {
		setUIntElement(offsetBits_fcflo(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'fcflo'
	 */
	public static int size_fcflo() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'fcflo'
	 */
	public static int sizeBits_fcflo() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: dsn
	// Field type: short, unsigned
	// Offset (bits): 24
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'dsn' is signed (false).
	 */
	public static boolean isSigned_dsn() {
		return false;
	}

	/**
	 * Return whether the field 'dsn' is an array (false).
	 */
	public static boolean isArray_dsn() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'dsn'
	 */
	public static int offset_dsn() {
		return (24 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'dsn'
	 */
	public static int offsetBits_dsn() {
		return 24;
	}

	/**
	 * Return the value (as a short) of the field 'dsn'
	 */
	public short get_dsn() {
		return (short) getUIntElement(offsetBits_dsn(), 8);
	}

	/**
	 * Set the value of the field 'dsn'
	 */
	public void set_dsn(short value) {
		setUIntElement(offsetBits_dsn(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'dsn'
	 */
	public static int size_dsn() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'dsn'
	 */
	public static int sizeBits_dsn() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: destpan
	// Field type: int, unsigned
	// Offset (bits): 32
	// Size (bits): 16
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'destpan' is signed (false).
	 */
	public static boolean isSigned_destpan() {
		return false;
	}

	/**
	 * Return whether the field 'destpan' is an array (false).
	 */
	public static boolean isArray_destpan() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'destpan'
	 */
	public static int offset_destpan() {
		return (32 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'destpan'
	 */
	public static int offsetBits_destpan() {
		return 32;
	}

	/**
	 * Return the value (as a int) of the field 'destpan'
	 */
	public int get_destpan() {
		return (int) getUIntElement(offsetBits_destpan(), 16);
	}

	/**
	 * Set the value of the field 'destpan'
	 */
	public void set_destpan(int value) {
		setUIntElement(offsetBits_destpan(), 16, value);
	}

	/**
	 * Return the size, in bytes, of the field 'destpan'
	 */
	public static int size_destpan() {
		return (16 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'destpan'
	 */
	public static int sizeBits_destpan() {
		return 16;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: addr
	// Field type: int, unsigned
	// Offset (bits): 48
	// Size (bits): 16
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'addr' is signed (false).
	 */
	public static boolean isSigned_addr() {
		return false;
	}

	/**
	 * Return whether the field 'addr' is an array (false).
	 */
	public static boolean isArray_addr() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'addr'
	 */
	public static int offset_addr() {
		return (48 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'addr'
	 */
	public static int offsetBits_addr() {
		return 48;
	}

	/**
	 * Return the value (as a int) of the field 'addr'
	 */
	public int get_addr() {
		return (int) getUIntElement(offsetBits_addr(), 16);
	}

	/**
	 * Set the value of the field 'addr'
	 */
	public void set_addr(int value) {
		setUIntElement(offsetBits_addr(), 16, value);
	}

	/**
	 * Return the size, in bytes, of the field 'addr'
	 */
	public static int size_addr() {
		return (16 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'addr'
	 */
	public static int sizeBits_addr() {
		return 16;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: type
	// Field type: short, unsigned
	// Offset (bits): 64
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'type' is signed (false).
	 */
	public static boolean isSigned_type() {
		return false;
	}

	/**
	 * Return whether the field 'type' is an array (false).
	 */
	public static boolean isArray_type() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'type'
	 */
	public static int offset_type() {
		return (64 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'type'
	 */
	public static int offsetBits_type() {
		return 64;
	}

	/**
	 * Return the value (as a short) of the field 'type'
	 */
	public short get_type() {
		return (short) getUIntElement(offsetBits_type(), 8);
	}

	/**
	 * Set the value of the field 'type'
	 */
	public void set_type(short value) {
		setUIntElement(offsetBits_type(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'type'
	 */
	public static int size_type() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'type'
	 */
	public static int sizeBits_type() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: group
	// Field type: short, unsigned
	// Offset (bits): 72
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'group' is signed (false).
	 */
	public static boolean isSigned_group() {
		return false;
	}

	/**
	 * Return whether the field 'group' is an array (false).
	 */
	public static boolean isArray_group() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'group'
	 */
	public static int offset_group() {
		return (72 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'group'
	 */
	public static int offsetBits_group() {
		return 72;
	}

	/**
	 * Return the value (as a short) of the field 'group'
	 */
	public short get_group() {
		return (short) getUIntElement(offsetBits_group(), 8);
	}

	/**
	 * Set the value of the field 'group'
	 */
	public void set_group(short value) {
		setUIntElement(offsetBits_group(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'group'
	 */
	public static int size_group() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'group'
	 */
	public static int sizeBits_group() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: data
	// Field type: byte[], unsigned
	// Offset (bits): 80
	// Size of each element (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'data' is signed (false).
	 */
	public static boolean isSigned_data() {
		return false;
	}

	/**
	 * Return whether the field 'data' is an array (true).
	 */
	public static boolean isArray_data() {
		return true;
	}

	/**
	 * Return the offset (in bytes) of the field 'data'
	 */
	public int offset_data(int index1) {
		int offset = 80;
		if (index1 < 0 || index1 >= 29)
			throw new ArrayIndexOutOfBoundsException();
		offset += 0 + index1 * 8;
		return (offset / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'data'
	 */
	public static int offsetBits_data(int index1) {
		int offset = 80;
		if (index1 < 0 || index1 >= 29)
			throw new ArrayIndexOutOfBoundsException();
		offset += 0 + index1 * 8;
		return offset;
	}

	/**
	 * Return the entire array 'data' as a byte[]
	 */
	public byte[] get_data() {
		byte[] tmp = new byte[29];
		for (int index0 = 0; index0 < numElements_data(0); index0++) {
			tmp[index0] = getElement_data(index0);
		}
		return tmp;
	}

	/**
	 * Set the contents of the array 'data' from the given byte[]
	 */
	public void set_data(byte[] value) {
		for (int index0 = 0; index0 < value.length; index0++) {
			setElement_data(index0, value[index0]);
		}
	}

	/**
	 * Return an element (as a byte) of the array 'data'
	 */
	public byte getElement_data(int index1) {
		return (byte) getSIntElement(offsetBits_data(index1), 8);
	}

	/**
	 * Set an element of the array 'data'
	 */
	public void setElement_data(int index1, byte value) {
		setSIntElement(offsetBits_data(index1), 8, value);
	}

	/**
	 * Return the total size, in bytes, of the array 'data'
	 */
	public int totalSize_data() {
		return (232 / 8);
	}

	/**
	 * Return the total size, in bits, of the array 'data'
	 */
	public int totalSizeBits_data() {
		return 232;
	}

	/**
	 * Return the size, in bytes, of each element of the array 'data'
	 */
	public static int elementSize_data() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of each element of the array 'data'
	 */
	public static int elementSizeBits_data() {
		return 8;
	}

	/**
	 * Return the number of dimensions in the array 'data'
	 */
	public static int numDimensions_data() {
		return 1;
	}

	/**
	 * Return the number of elements in the array 'data'
	 */
	public int numElements_data() {
		return 29;
	}

	/**
	 * Return the number of elements in the array 'data' for the given
	 * dimension.
	 */
	public int numElements_data(int dimension) {
		int array_dims[] = { 29, };
		if (dimension < 0 || dimension >= 1)
			throw new ArrayIndexOutOfBoundsException();
		if (array_dims[dimension] == 0)
			throw new IllegalArgumentException("Array dimension " + dimension
					+ " has unknown size");
		return array_dims[dimension];
	}

	/**
	 * Fill in the array 'data' with a String
	 */
	public void setString_data(String s) {
		int len = s.length();
		int i;
		for (i = 0; i < len; i++) {
			setElement_data(i, (byte) s.charAt(i));
		}
		setElement_data(i, (byte) 0); // null terminate
	}

	/**
	 * Read the array 'data' as a String
	 */
	public String getString_data() {
		char carr[] = new char[Math.min(
				tools.message.Message.MAX_CONVERTED_STRING_LENGTH, 29)];
		int i;
		for (i = 0; i < carr.length; i++) {
			if ((char) getElement_data(i) == (char) 0)
				break;
			carr[i] = (char) getElement_data(i);
		}
		return new String(carr, 0, i);
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: crc
	// Field type: int, unsigned
	// Offset (bits): 312
	// Size (bits): 16
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'crc' is signed (false).
	 */
	public static boolean isSigned_crc() {
		return false;
	}

	/**
	 * Return whether the field 'crc' is an array (false).
	 */
	public static boolean isArray_crc() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'crc'
	 */
	public int offset_crc() {
		return (312 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'crc'
	 */
	public int offsetBits_crc() {
		return 312;
	}

	/**
	 * Return the value (as a int) of the field 'crc'
	 */
	public int get_crc() {
		return (int) getUIntElement(offsetBits_crc(), 16);
	}

	/**
	 * Set the value of the field 'crc'
	 */
	public void set_crc(int value) {
		setUIntElement(offsetBits_crc(), 16, value);
	}

	/**
	 * Return the size, in bytes, of the field 'crc'
	 */
	public static int size_crc() {
		return (16 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'crc'
	 */
	public static int sizeBits_crc() {
		return 16;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: strength
	// Field type: short, unsigned
	// Offset (bits): 328
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'strength' is signed (false).
	 */
	public static boolean isSigned_strength() {
		return false;
	}

	/**
	 * Return whether the field 'strength' is an array (false).
	 */
	public static boolean isArray_strength() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'strength'
	 */
	public static int offset_strength() {
		return (328 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'strength'
	 */
	public static int offsetBits_strength() {
		return 328;
	}

	/**
	 * Return the value (as a short) of the field 'strength'
	 */
	public int get_strength() {
		return (int) getUIntElement(offsetBits_strength(), 8);
	}

	/**
	 * Set the value of the field 'strength'
	 */
	public void set_strength(int value) {
		setUIntElement(offsetBits_strength(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'strength'
	 */
	public static int size_strength() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'strength'
	 */
	public static int sizeBits_strength() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: lqi
	// Field type: short, unsigned
	// Offset (bits): 336
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'lqi' is signed (false).
	 */
	public static boolean isSigned_lqi() {
		return false;
	}

	/**
	 * Return whether the field 'lqi' is an array (false).
	 */
	public static boolean isArray_lqi() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'lqi'
	 */
	public static int offset_lqi() {
		return (336 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'lqi'
	 */
	public static int offsetBits_lqi() {
		return 336;
	}

	/**
	 * Return the value (as a short) of the field 'lqi'
	 */
	public short get_lqi() {
		return (short) getUIntElement(offsetBits_lqi(), 8);
	}

	/**
	 * Set the value of the field 'lqi'
	 */
	public void set_lqi(short value) {
		setUIntElement(offsetBits_lqi(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'lqi'
	 */
	public static int size_lqi() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'lqi'
	 */
	public static int sizeBits_lqi() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: ack
	// Field type: short, unsigned
	// Offset (bits): 344
	// Size (bits): 8
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'ack' is signed (false).
	 */
	public static boolean isSigned_ack() {
		return false;
	}

	/**
	 * Return whether the field 'ack' is an array (false).
	 */
	public static boolean isArray_ack() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'ack'
	 */
	public static int offset_ack() {
		return (344 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'ack'
	 */
	public static int offsetBits_ack() {
		return 344;
	}

	/**
	 * Return the value (as a short) of the field 'ack'
	 */
	public short get_ack() {
		return (short) getUIntElement(offsetBits_ack(), 8);
	}

	/**
	 * Set the value of the field 'ack'
	 */
	public void set_ack(short value) {
		setUIntElement(offsetBits_ack(), 8, value);
	}

	/**
	 * Return the size, in bytes, of the field 'ack'
	 */
	public static int size_ack() {
		return (8 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'ack'
	 */
	public static int sizeBits_ack() {
		return 8;
	}

	// ///////////////////////////////////////////////////////
	// Accessor methods for field: time
	// Field type: int, unsigned
	// Offset (bits): 352
	// Size (bits): 16
	// ///////////////////////////////////////////////////////

	/**
	 * Return whether the field 'time' is signed (false).
	 */
	public static boolean isSigned_time() {
		return false;
	}

	/**
	 * Return whether the field 'time' is an array (false).
	 */
	public static boolean isArray_time() {
		return false;
	}

	/**
	 * Return the offset (in bytes) of the field 'time'
	 */
	public static int offset_time() {
		return (352 / 8);
	}

	/**
	 * Return the offset (in bits) of the field 'time'
	 */
	public static int offsetBits_time() {
		return 352;
	}

	/**
	 * Return the value (as a int) of the field 'time'
	 */
	public int get_time() {
		return (int) getUIntElement(offsetBits_time(), 16);
	}

	/**
	 * Set the value of the field 'time'
	 */
	public void set_time(int value) {
		setUIntElement(offsetBits_time(), 16, value);
	}

	/**
	 * Return the size, in bytes, of the field 'time'
	 */
	public static int size_time() {
		return (16 / 8);
	}

	/**
	 * Return the size, in bits, of the field 'time'
	 */
	public static int sizeBits_time() {
		return 16;
	}

}
