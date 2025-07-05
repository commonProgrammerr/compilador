#define teste
int x = 12;
const char* text = "texto";
void printf()
{
  printf("Base: %d, %s", x, text);
}
class Base
{
  int x;
  const char* text;
  
  constructor()
  {
    this.x = 10;
    this.text = "base";
    printf("Base constructor called");
  } 
  
  void printf()
  {
    printf("Base: %d, %s", this.x, this.text);
  }

  int calculate(int a, int b)
  {
    return a * b + this.x;
  }
}

class Derived extends Base
{
  bool flag; // = true;

  void printf()
  {
    printf("Derived: %s",  this.x);
    if (this.flag)
    {
      printf("Flag is true");
    }
  }

  void special()
  {
    printf("Special method");
  }
}

class MathUtil
{
  int square(int n)
  {
    return n * n;
  }

  int factorial(int n)
  {
    if (n <= 1)
      return 1;
    return n * this.factorial(n - 1);
  }
}

class DataHolder
{
  int values[];

  constructor(int size)
  {
    malloc(this.values, size);
  }

  void set(int index, int value)
  {
    this.values[index] = value;
  }

  int get(int index)
  {
    return this.values[index];
  }
}


class Derived2 extends Derived
{
  // 13. Sobrecarga de métodos
  void testThis()
  {
    // printf("This.x = %s",  this.x);
    // this.x = 20;
    // printf("Modified this.x = %s",  this.x);
  }
}

// 14. Classe sem herança
class Simple
{
  void execute()
  {
    printf("Simple class executed");
  }
}

class Main
{
  void test() {

  }
  void run()
  {
    this.test();
    MathUtil math = new MathUtil();
    // 1. Instanciação básica
    Base b = new Base();
    b.printf();

    // 2. Herança e polimorfismo
    Base d = new Derived();
    d.printf();

    // 3. Acesso a métodos e campos
    printf("Calculation: %d",  b.calculate(3, 4));
    printf("Square: %d",  math.square(5));

    // 4. Chamada de método estático recursivo
    printf("Factorial: %d",  math.factorial(5));

    // 5. Uso de this
    Derived2 d2 = new Derived2();
    d2.testThis();

    // 6. Manipulação de arrays
    DataHolder dh = new DataHolder(3);
    dh.set(0, 10);
    dh.set(1, 20);
    dh.set(2, 30);
    printf("Value at index 1: %d",  dh.get(1));

    // 7. Controle de fluxo
    int i = 0;
    while (i < 3)
    {
      printf("While loop: i=%d",  i);
      i = i + 1;
    }
    MathUtil math = new MathUtil();
    // 8. Expressões complexas
    int result = (b.calculate(2, 3) + math.square(4)) * 2;
    printf("Complex result: %d",  result);

    // 9. Operações boolas
    bool test = (10 > 5) && (3 == 3) || false;
    printf("bool test: %d",  test);

    // 10. Acesso a método via casting
    ((Derived)d).special();

    // 11. Array como objeto
    int arr[10];
    arr[0] = 100;
    arr[1] = 200;
    printf("Array value: %d",  arr[1]);

    // 12. NULL safety check
    Base NULLObj = NULL;
    if (NULLObj == NULL)
    {
      printf("NULL object detected");
    }
    for (int i = 10; i < 10; i++) {
      printf("times %d", i);
    }
  }

}
