/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 17 22:38:25 GMT 2019
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.BlockResult;
import org.jfree.chart.entity.EntityCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BlockResult_ESTest extends BlockResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockResult blockResult0 = new BlockResult();
      blockResult0.setEntityCollection((EntityCollection) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BlockResult blockResult0 = new BlockResult();
      EntityCollection entityCollection0 = blockResult0.getEntityCollection();
      assertNull(entityCollection0);
  }
}