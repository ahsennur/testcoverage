import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void test1() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);
    int result=c.countNumberOfOccurrences("str");
    assertEquals(result,-1);
  }
  @Test
  public void test2() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.contains(anyString())).thenReturn(false);
    int result=c.countNumberOfOccurrences("str");
    assertEquals(result,-1);
  }
  
}