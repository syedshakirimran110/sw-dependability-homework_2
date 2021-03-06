/**
 * ArrayUtil.java A class for working with arrays.
 */

/* This file is part of Math4J.
 * Math4J is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * Math4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Math4J; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 * 
 * Copyright 2005 Anthony Magee
 */

package org.magee.util;

// import other packages
// import java.math.BigDecimal;
import java.util.ArrayList;

/*
 * version changes
 */
public class ArrayUtil {

    /**
     * Removes the element at <code>index</code> from Object array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static Object[] removeIndexElement(Object[] arr, int index) {
        if(index < arr.length) {
            Object[] reply = new Object[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Removes the element at <code>index</code> from boolean array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static boolean[] removeIndexElement(boolean[] arr, int index) {
        if(index < arr.length) {
            boolean[] reply = new boolean[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Removes the element at <code>index</code> from byte array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static byte[] removeIndexElement(byte[] arr, int index) {
        if(index < arr.length) {
            byte[] reply = new byte[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Removes the element at <code>index</code> from char array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static char[] removeIndexElement(char[] arr, int index) {
        if(index < arr.length) {
            char[] reply = new char[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Removes the element at <code>index</code> from double array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static double[] removeIndexElement(double[] arr, int index) {
        if(index < arr.length) {
            double[] reply = new double[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Removes the element at <code>index</code> from float array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static float[] removeIndexElement(float[] arr, int index) {
        if(index < arr.length) {
            float[] reply = new float[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Removes the element at <code>index</code> from int array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static int[] removeIndexElement(int[] arr, int index) {
        if(index < arr.length) {
            int[] reply = new int[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Removes the element at <code>index</code> from long array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static long[] removeIndexElement(long[] arr, int index) {
        if(index < arr.length) {
            long[] reply = new long[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Removes the element at <code>index</code> from short array
     * <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @param index The index of the element to remove.
     * @throws IllegalArgumentExcpetion
     * @return The array without the element at <code>index</code>.
     */
    public static short[] removeIndexElement(short[] arr, int index) {
        if(index < arr.length) {
            short[] reply = new short[arr.length - 1];
            for(int i = 0; i < reply.length; i++) {
                if(i < index)
                    reply[i] = arr[i];
                else
                    reply[i] = arr[i + 1];
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(index + " is not a valid index");
    }

    /**
     * Reverses the order of the elements in Object array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static Object[] reverse(Object[] arr) {
        Object[] reply = new Object[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Reverses the order of the elements in boolean array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static boolean[] reverse(boolean[] arr) {
        boolean[] reply = new boolean[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Reverses the order of the elements in byte array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static byte[] reverse(byte[] arr) {
        byte[] reply = new byte[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Reverses the order of the elements in char array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static char[] reverse(char[] arr) {
        char[] reply = new char[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Reverses the order of the elements in double array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static double[] reverse(double[] arr) {
        double[] reply = new double[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Reverses the order of the elements in float array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static float[] reverse(float[] arr) {
        float[] reply = new float[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Reverses the order of the elements in int array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static int[] reverse(int[] arr) {
        int[] reply = new int[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Reverses the order of the elements in long array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static long[] reverse(long[] arr) {
        long[] reply = new long[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Reverses the order of the elements in short array <code>arr</code>.
     * 
     * @param arr The array to be transformed.
     * @return The array in reverse order.
     */
    public static short[] reverse(short[] arr) {
        short[] reply = new short[arr.length];
        for(int i = 0; i < reply.length; i++) {
            reply[reply.length - 1 - i] = arr[i];
        }
        return reply;
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static Object[] subArray(Object[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            Object[] reply = new Object[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static boolean[] subArray(boolean[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            boolean[] reply = new boolean[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static byte[] subArray(byte[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            byte[] reply = new byte[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static char[] subArray(char[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            char[] reply = new char[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static double[] subArray(double[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            double[] reply = new double[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static float[] subArray(float[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            float[] reply = new float[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static int[] subArray(int[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            int[] reply = new int[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static long[] subArray(long[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            long[] reply = new long[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Creates a subarray of <code>arr</code> starting at <code>start</code>
     * and continuing numerically until <code>start</code> +
     * <code>length</code> has been reached. If <code>arr</code> does not
     * contain enough elements to satisfy <code>length</code> the returned
     * array will have null elements in the unfilled indices.
     * 
     * @param arr The array to be transformed.
     * @param start The starting index.
     * @param length The number of elements desired.
     * @return {arr[start], ..., arr[start + length]}
     * @throws ArrayIndexOutOfBoundsException
     */
    public static short[] subArray(short[] arr, int start, int length) {
        if(start < arr.length) {
            if(arr.length - start < length)
                length = arr.length - start;
            short[] reply = new short[length];
            for(int i = 0; i < length; i++) {
                try {
                    reply[i] = arr[i + start];
                } catch(ArrayIndexOutOfBoundsException e) {
                }
            }
            return reply;
        } else
            throw new ArrayIndexOutOfBoundsException(start + " is not a valid start index.");
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(Object[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i].toString());
                reply.append(", ");
            } else
                reply.append(arr[i].toString());
        }
        reply.append("} ");
        return reply.toString();
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(boolean[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i]);
                reply.append(", ");
            } else
                reply.append(arr[i]);
        }
        reply.append("}");
        return reply.toString();
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(byte[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i]);
                reply.append(", ");
            } else
                reply.append(arr[i]);
        }
        reply.append("}");
        return reply.toString();
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(char[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i]);
                reply.append(", ");
            } else
                reply.append(arr[i]);
        }
        reply.append("}");
        return reply.toString();
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(double[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i]);
                reply.append(", ");
            } else
                reply.append(arr[i]);
        }
        reply.append("}");
        return reply.toString();
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(float[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i]);
                reply.append(", ");
            } else
                reply.append(arr[i]);
        }
        reply.append("}");
        return reply.toString();
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(int[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i]);
                reply.append(", ");
            } else
                reply.append(arr[i]);
        }
        reply.append("}");
        return reply.toString();
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(long[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i]);
                reply.append(", ");
            } else
                reply.append(arr[i]);
        }
        reply.append("}");
        return reply.toString();
    }

    /**
     * Returns a string representation of <code>arr</code>.
     */
    public static String toString(short[] arr) {
        StringBuffer reply = new StringBuffer();
        reply.append("{");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                reply.append(arr[i]);
                reply.append(", ");
            } else
                reply.append(arr[i]);
        }
        reply.append("}");
        return reply.toString();
    }

    /**
     * Removes all null elements in an Object array. Be sure to cast the array
     * back to the class type you need.
     * 
     * @return array <code>arr</code> less any null elements
     */
    public static Object[] removeNulls(Object[] arr) {
        ArrayList<Object> reply = new ArrayList<Object>(arr.length);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != null)
                reply.add(arr[i]);
        }

        return reply.toArray();
    }
}