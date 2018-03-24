package triangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test; 

public class TestTriangle {
  private Triangle tri;
  
  @Before  
  public void setUp(){  
	  tri = new Triangle();  
  }
  
//单元测试  
  @Test  
  public void testJudgeEquilateral(){  
      
      assertEquals("判断是否为等边三角形出错", true, tri.judgeEquilateral(3,3,3)); 
      assertEquals("不组成三角形出错",false,tri.judgeEquilateral(0, 1, 2));
      assertEquals("不组成三角形出错",false,tri.judgeEquilateral(-3, -3, -3));
      
  }  
  @Test  
  public void testJudgeIsosceles(){  
      
      assertEquals("判断是否为等腰三角形出错", true, tri.judgeIsosceles(2,3,3)); 
      
  }
  
  @Test  
  public void testJudgeScalene(){  
      
      assertEquals("判断是否为不等边三角形出错", true, tri.judgeScalene(3,4,5)); 
      
  }
}
