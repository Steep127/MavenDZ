import Lesson4.TriangleFunction;
import Lesson4.TriangleMinucException;
import Lesson4.TriangleZeroException;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.*;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class TriangleAreaTest {

 //   private static Logger logger = (Logger) LoggerFactory.getLogger(TriangleAreaTest.class);

   @BeforeAll
    static void beforeAll(){
     //  logger.info("INFO");
       System.out.println("Метод Выполнился 1 раз перед всеми тестами класса");
   }

   @BeforeEach
    void beforeEach(){
       System.out.println("Метод выполняется перед каждым тестом класса");

   }

   @AfterEach
    void afterEach(){
       System.out.println("Метод выполняется после каждого теста класса");
   }

   @AfterAll
    static void afterAll(){
       System.out.println("Метод выоплняется после конца всех тестов");
   }



   @Test
   @DisplayName("Тест на проверку длины сторон треугольника на ноль(True)")
    void IsTriangleAreaPointsNotZeroTrue() throws TriangleZeroException {
       TriangleFunction triangleFunction = new TriangleFunction(3, 2, 3);
       boolean result = triangleFunction.proverkaCtoronHaNolb();
       Assertions.assertTrue(result);
   }

    @Test
    @DisplayName("Тест на проверку длины сторон треугольника на ноль(False)")
    void IsTriangleAreaPointsNotZeroFalse() throws TriangleZeroException {
        TriangleFunction triangleFunction = new TriangleFunction(3, 0, 3);
        boolean result = triangleFunction.proverkaCtoronHaNolb();
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Тест на проверку длины сторон треугольника на минус(True)")
    void IsTriangleAreaPointsNotMinus() throws TriangleMinucException {
       TriangleFunction triangleFunction = new TriangleFunction(1, 2, 3);
       boolean result = triangleFunction.proverkaCtoronHaMunyc();
       Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Тест на проверку длины сторон треугольника на минус(False)")
    void IsTriangleAreaPointsIsMinus() throws TriangleMinucException{
       TriangleFunction triangleFunction = new TriangleFunction(5, 4, -1);
       boolean result = triangleFunction.proverkaCtoronHaMunyc();
       Assertions.assertTrue(result);
    }


}
