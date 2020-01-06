/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 21:28:11 GMT 2019
 */

package org.jfree.data.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDBCCategoryDataset_ESTest extends JDBCCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery("org.jfree.data.xy.XYDataItem");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // JDBCCategoryDataset.executeQuery() : insufficient columns returned from the database.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset("", "org.jfree.data.jdbc.JDBCXYDataset", "", "");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // No suitable driver found for 
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset("42uo4*53=", "", "M$V[F`r~oAR)^", "T~mXC");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection1).createStatement();
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery(connection1, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery(connection1, "FA");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // A connection must be supplied.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 4;
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0, (Statement) null).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "");
      jDBCCategoryDataset0.setValue(0.0, (Comparable) "", (Comparable) "");
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      try { 
        jDBCCategoryDataset0.executeQuery(connection1, "Co&!,LeS");
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // JDBCCategoryDataset.executeQuery() : insufficient columns returned from the database.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      jDBCCategoryDataset0.executeQuery(connection1, "Co&!,LeS");
      assertTrue(jDBCCategoryDataset0.getTranspose());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset((Connection) null, "WH/VdA:o");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // A connection must be supplied.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset((String) null, (String) null, (String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      jDBCCategoryDataset0.setTranspose(false);
      boolean boolean0 = jDBCCategoryDataset0.getTranspose();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      boolean boolean0 = jDBCCategoryDataset0.getTranspose();
      assertTrue(boolean0);
  }
}
