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
  
//��Ԫ����  
  @Test  
  public void testJudgeEquilateral(){  
      
      assertEquals("�ж��Ƿ�Ϊ�ȱ������γ���", true, tri.judgeEquilateral(3,3,3)); 
      assertEquals("����������γ���",false,tri.judgeEquilateral(0, 1, 2));
      assertEquals("����������γ���",false,tri.judgeEquilateral(-3, -3, -3));
      
  }  
  @Test  
  public void testJudgeIsosceles(){  
      
      assertEquals("�ж��Ƿ�Ϊ���������γ���", true, tri.judgeIsosceles(2,3,3)); 
      
  }
  
  @Test  
  public void testJudgeScalene(){  
      
      assertEquals("�ж��Ƿ�Ϊ���ȱ������γ���", true, tri.judgeScalene(3,4,5)); 
      
  }
}
