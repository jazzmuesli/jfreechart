/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:51:15 GMT 2019
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Window;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.math.BigInteger;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.DefaultShadowGenerator;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DefaultShadowGenerator_ESTest extends DefaultShadowGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      defaultShadowGenerator0.hashCode();
      defaultShadowGenerator0.getDistance();
      Color color0 = Color.black;
      Color color1 = color0.darker();
      DefaultShadowGenerator defaultShadowGenerator1 = new DefaultShadowGenerator(16777215, color1, (-3363.0F), 16777215, (-0.7853981633974483));
      defaultShadowGenerator0.equals(defaultShadowGenerator1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 1;
      Color color0 = Color.gray;
      Color.getColor("");
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(1, color0, 0.0F, 1, 1);
      int int1 = 4698;
      BufferedImage bufferedImage0 = new BufferedImage(1, 4698, 1);
      BufferedImage bufferedImage1 = new BufferedImage(1, 1, 1);
      defaultShadowGenerator0.applyShadow(bufferedImage1);
      defaultShadowGenerator0.calculateOffsetY();
      int[] intArray0 = new int[2];
      defaultShadowGenerator0.createDropShadow(bufferedImage1);
      intArray0[0] = 1;
      intArray0[1] = 1;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(4698, 1, intArray0, 2, false, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      BufferedImage bufferedImage0 = new BufferedImage(3300, 5, 5);
      // Undeclared exception!
      defaultShadowGenerator0.createDropShadow(bufferedImage0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 1;
      Color color0 = Color.gray;
      Color.getColor("");
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      int int1 = 4698;
      BufferedImage bufferedImage0 = new BufferedImage(1, 4698, 1);
      // Undeclared exception!
      defaultShadowGenerator0.createDropShadow(bufferedImage0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 1;
      Color color0 = Color.gray;
      Color.getColor("");
      int int1 = 4698;
      BufferedImage bufferedImage0 = new BufferedImage(1, 4698, 1);
      Color.getColor("<@dW38ZtDek_mra5");
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(1423, color0, 1423, 193, 4235.5492873886);
      // Undeclared exception!
      defaultShadowGenerator0.applyShadow(bufferedImage0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Color color0 = Color.GRAY;
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(1, color0, 0, (-519), 0.0);
      defaultShadowGenerator0.getDistance();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.getBounds();
      AffineTransform affineTransform0 = new AffineTransform();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_COLOR_RENDERING;
      Integer integer0 = new Integer(17);
      RenderingHints renderingHints0 = new RenderingHints(sunHints_Key0, integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = (-1);
      Color color0 = Color.pink;
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator((-1), color0, (-1), (-1), 5917.861351787);
      float[] floatArray0 = new float[8];
      floatArray0[0] = (float) (-1);
      floatArray0[1] = (float) (-1);
      floatArray0[2] = (float) (-1);
      floatArray0[3] = (float) (-1);
      floatArray0[4] = (float) (-1);
      floatArray0[5] = (float) (-1);
      floatArray0[6] = (-1.0F);
      floatArray0[7] = (float) (-1);
      color0.getRGBColorComponents(floatArray0);
      float[] floatArray1 = new float[3];
      floatArray1[0] = (float) (-1);
      floatArray1[1] = (float) (-1);
      floatArray1[2] = (float) (-1);
      color0.getRGBColorComponents(floatArray1);
      defaultShadowGenerator0.getAngle();
      defaultShadowGenerator0.calculateOffsetX();
      defaultShadowGenerator0.calculateOffsetY();
      int int1 = (-96);
      int int2 = 1;
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = (-1);
      intArray0[5] = (-1214);
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(1, 1, intArray0, (-1214), true, (-77), (-4644));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // transferType must be eitherDataBuffer.TYPE_BYTE or DataBuffer.TYPE_USHORT
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Color color0 = Color.ORANGE;
      float[] floatArray0 = new float[3];
      floatArray0[0] = (float) 1983;
      floatArray0[1] = (float) 1983;
      floatArray0[2] = (float) 1983;
      color0.getRGBColorComponents(floatArray0);
      color0.getColorComponents(floatArray0);
      Color.getColor("IY4>Gz ^=Bgmq/w\"kq");
      Color color1 = Color.getColor("", 1983);
      color0.getComponents((float[]) null);
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(1983, color0, (-1.0F), (-1), (-2071.198642134));
      defaultShadowGenerator0.calculateOffsetX();
      defaultShadowGenerator0.getShadowOpacity();
      Color.getColor("");
      defaultShadowGenerator0.equals(color1);
      defaultShadowGenerator0.getShadowSize();
      defaultShadowGenerator0.getAngle();
      defaultShadowGenerator0.hashCode();
      // Undeclared exception!
      try { 
        defaultShadowGenerator0.createDropShadow((BufferedImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.DefaultShadowGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 0;
      boolean boolean0 = false;
      Color color0 = new Color(0, false);
      color0.getColorSpace();
      float[] floatArray0 = new float[4];
      floatArray0[0] = 0.0F;
      floatArray0[1] = (float) 0;
      floatArray0[2] = 0.0F;
      floatArray0[3] = 0.0F;
      color0.getRGBColorComponents(floatArray0);
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(0, color0, 0.0F, 0, (-1030.3351520271));
      defaultShadowGenerator0.getShadowOpacity();
      defaultShadowGenerator0.getAngle();
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage(0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type 0
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 0;
      Color color0 = new Color(0, false);
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator((-233), color0, 0, (-233), 0);
      defaultShadowGenerator0.hashCode();
      Color.getColor("", color0);
      defaultShadowGenerator0.getShadowSize();
      defaultShadowGenerator0.calculateOffsetY();
      Object object0 = new Object();
      defaultShadowGenerator0.equals(object0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte)44;
      byteArray0[2] = (byte) (-27);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)66;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)2;
      byteArray0[8] = (byte)0;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel((-1134), 0, byteArray0, 0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of pixel bits must be > 0
         //
         verifyException("java.awt.image.ColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Color color0 = Color.pink;
      Color color1 = color0.brighter();
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(0, color1, 0, 0, 0.0);
      defaultShadowGenerator0.getAngle();
      defaultShadowGenerator0.calculateOffsetY();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      // Undeclared exception!
      try { 
        defaultShadowGenerator0.applyShadow((BufferedImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.DefaultShadowGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Color color0 = new Color(0, true);
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(0, color0, 1.0F, 2975, 0);
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) 0;
      floatArray0[1] = 1.0F;
      floatArray0[2] = (float) 2975;
      floatArray0[3] = 1.0F;
      floatArray0[4] = 0.0F;
      floatArray0[5] = 1.0F;
      floatArray0[6] = (float) 0;
      color0.getRGBComponents(floatArray0);
      defaultShadowGenerator0.getAngle();
      defaultShadowGenerator0.equals(color0);
      defaultShadowGenerator0.getShadowColor();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Color color0 = Color.GRAY;
      Color.getColor("Not possible!");
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(1991, color0, 0.0F, (-166), 1482.6644);
      defaultShadowGenerator0.equals("7eSe5NiGPJ6@%/{?|");
      defaultShadowGenerator0.calculateOffsetX();
      defaultShadowGenerator0.getShadowColor();
      defaultShadowGenerator0.getShadowSize();
      Object object0 = new Object();
      defaultShadowGenerator0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Color color0 = Color.black;
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(2020, color0, 1.0F, 1, 1);
      Object object0 = new Object();
      defaultShadowGenerator0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      defaultShadowGenerator0.getDistance();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Color color0 = Color.gray;
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator((-392), color0, (-392), 0, (-392));
      defaultShadowGenerator0.calculateOffsetX();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      BufferedImage bufferedImage0 = null;
      // Undeclared exception!
      try { 
        defaultShadowGenerator0.createDropShadow((BufferedImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.DefaultShadowGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = (-3826);
      DefaultShadowGenerator defaultShadowGenerator0 = null;
      try {
        defaultShadowGenerator0 = new DefaultShadowGenerator((-3826), (Color) null, (-3826), (-3826), (-3826));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'color' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      DataBufferInt dataBufferInt0 = new DataBufferInt(427);
      defaultShadowGenerator0.equals(dataBufferInt0);
      defaultShadowGenerator0.getDistance();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte)84;
      byteArray0[2] = (byte) (-40);
      byteArray0[3] = (byte) (-26);
      byteArray0[4] = (byte) (-36);
      DefaultShadowGenerator defaultShadowGenerator1 = new DefaultShadowGenerator();
      defaultShadowGenerator0.equals(defaultShadowGenerator1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 1;
      Color color0 = Color.gray;
      Color.getColor("");
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(1, color0, 1, 1, 1);
      int int1 = 4698;
      BufferedImage bufferedImage0 = new BufferedImage(1, 4698, 1);
      defaultShadowGenerator0.applyShadow(bufferedImage0);
      defaultShadowGenerator0.calculateOffsetY();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 1;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(4698, 1, intArray0, 2, false, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Color color0 = Color.WHITE;
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator((-50), color0, 0.0F, (-50), 354.39);
      defaultShadowGenerator0.hashCode();
      defaultShadowGenerator0.calculateOffsetX();
      defaultShadowGenerator0.equals(color0);
      float[] floatArray0 = new float[0];
      defaultShadowGenerator0.getAngle();
      defaultShadowGenerator0.getAngle();
      defaultShadowGenerator0.getShadowSize();
      int int0 = 0;
      // Undeclared exception!
      try { 
        ColorSpace.getInstance((-50));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown color space
         //
         verifyException("java.awt.color.ColorSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)38;
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)61;
      byte byte1 = (byte)1;
      byteArray0[4] = (byte)1;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(1510, 1510, byteArray0, byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 1;
      Color color0 = Color.gray;
      Color.getColor("");
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(1, color0, 0.0F, 1, 1);
      int int1 = 4698;
      BufferedImage bufferedImage0 = new BufferedImage(1, 4698, 1);
      // Undeclared exception!
      defaultShadowGenerator0.createDropShadow(bufferedImage0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      int int0 = 3980;
      int[] intArray0 = new int[0];
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)62;
      byteArray0[0] = (byte)62;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-35);
      byte byte1 = (byte) (-1);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)0;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(3980, 3309, intArray0, 3309, 3980, bigInteger0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)0;
      byte byte0 = (byte)62;
      byteArray0[2] = (byte)62;
      byteArray0[3] = (byte) (-1);
      byte byte1 = (byte) (-97);
      byteArray0[4] = (byte) (-97);
      byteArray0[5] = (byte)0;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(1113, (-356), byteArray0, byteArray0, byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Color color0 = Color.YELLOW;
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator(0, color0, 1705.798F, 856, (-0.7853981633974483));
      defaultShadowGenerator0.getShadowColor();
      assertEquals(1705.798F, defaultShadowGenerator0.getShadowOpacity(), 0.01F);
      assertEquals(856, defaultShadowGenerator0.getDistance());
      assertEquals(605, defaultShadowGenerator0.calculateOffsetY());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage(695, 0, 2236);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type 2236
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultShadowGenerator defaultShadowGenerator0 = new DefaultShadowGenerator();
      defaultShadowGenerator0.hashCode();
      defaultShadowGenerator0.getAngle();
      defaultShadowGenerator0.getShadowOpacity();
      defaultShadowGenerator0.calculateOffsetY();
      defaultShadowGenerator0.getShadowColor();
      // Undeclared exception!
      try { 
        defaultShadowGenerator0.applyShadow((BufferedImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.DefaultShadowGenerator", e);
      }
  }
}
