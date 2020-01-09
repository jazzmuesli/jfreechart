/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:32:54 GMT 2019
 */

package org.jfree.data.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharConversionException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import javax.xml.parsers.SAXParserFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jfree.data.xml.DatasetReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DatasetReader_ESTest extends DatasetReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SAXParserFactory sAXParserFactory0 = SAXParserFactory.newInstance();
      DatasetReader.setSAXParserFactory(sAXParserFactory0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatasetReader.setSAXParserFactory((SAXParserFactory) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'f' argument.
         //
         verifyException("org.jfree.chart.util.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatasetReader.readPieDatasetFromXML((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream cannot be null
         //
         verifyException("javax.xml.parsers.SAXParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      // Undeclared exception!
      try { 
        DatasetReader.readPieDatasetFromXML(inputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.jfree.data.xml.DatasetReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(13);
      try { 
        DatasetReader.readPieDatasetFromXML((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("x=yv(>#W", "x=yv(>#W");
      // Undeclared exception!
      try { 
        DatasetReader.readPieDatasetFromXML(file0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Premature end of file.
         //
         verifyException("org.jfree.data.xml.DatasetReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("").when(file0).getAbsolutePath();
      try { 
        DatasetReader.readPieDatasetFromXML(file0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      doReturn(0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      // Undeclared exception!
      try { 
        DatasetReader.readCategoryDatasetFromXML(inputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.jfree.data.xml.DatasetReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatasetReader.readCategoryDatasetFromXML((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream cannot be null
         //
         verifyException("javax.xml.parsers.SAXParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn((-1436), (-1436), (-1436), (-1436), (-1436)).when(inputStream0).read();
      doReturn((-1436)).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      // Undeclared exception!
      try { 
        DatasetReader.readCategoryDatasetFromXML(inputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DatasetReader.readCategoryDatasetFromXML((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getAbsolutePath();
      // Undeclared exception!
      try { 
        DatasetReader.readCategoryDatasetFromXML(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Call to addMonths resulted in unsupported year");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("Call to addMonths resulted in unsupported year").when(file0).getAbsolutePath();
      try { 
        DatasetReader.readCategoryDatasetFromXML(file0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("org.jfree.data.xml.CategoryDatasetHandler").when(file0).getAbsolutePath();
      try { 
        DatasetReader.readCategoryDatasetFromXML(file0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Call to addMonths resulted in unsupported year");
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-111);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("Call to addMonths resulted in unsupported year").when(file0).getAbsolutePath();
      try { 
        DatasetReader.readCategoryDatasetFromXML(file0);
        fail("Expecting exception: CharConversionException");
      
      } catch(CharConversionException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SAXParserFactory sAXParserFactory0 = DatasetReader.getSAXParserFactory();
      SAXParserFactory sAXParserFactory1 = DatasetReader.getSAXParserFactory();
      assertSame(sAXParserFactory1, sAXParserFactory0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(file0).getAbsolutePath();
      // Undeclared exception!
      try { 
        DatasetReader.readPieDatasetFromXML(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Call to addMonths resulted in unsupported year");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn("Call to addMonths resulted in unsupported year").when(file0).getAbsolutePath();
      // Undeclared exception!
      try { 
        DatasetReader.readCategoryDatasetFromXML(file0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.jfree.data.xml.DatasetReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DatasetReader datasetReader0 = new DatasetReader();
  }
}
