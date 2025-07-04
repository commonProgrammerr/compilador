#define teste
void print()
  {
    printf("Base: %d, %s", x, text);
  }
class Base
{
  int x;
  const char* text;
  
  constructor()
  {
    // this->x = 10;
    // this.text = "base";
    print("Base constructor called");
  } 
  
  void print()
  {
    printf("Base: %d, %s", x, text);
  }

  int calculate(int a, int b)
  {
    return a * b + x;
  }
}

class Derived extends Base
{
  bool flag; // = true;

  void print()
  {
    print("Derived: " + x);
    if (flag)
    {
      print("Flag is true");
    }
  }

  void special()
  {
    print("Special method");
  }
}

class MathUtil
{
  static int square(int n)
  {
    return n * n;
  }

  static int factorial(int n)
  {
    if (n <= 1)
      return 1;
    return n * factorial(n - 1);
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
    values[index] = value;
  }

  int get(int index)
  {
    return values[index];
  }
}

class Main
{
  void run()
  {
    // 1. Instanciação básica
    Base b = new Base();
    b.print();

    // 2. Herança e polimorfismo
    Base d = new Derived();
    d.print();

    // 3. Acesso a métodos e campos
    print("Calculation: " + b.calculate(3, 4));
    print("Square: " + MathUtil.square(5));

    // 4. Chamada de método estático recursivo
    print("Factorial: " + MathUtil.factorial(5));

    // 5. Uso de this
    Derived d2 = new Derived();
    d2.testThis();

    // 6. Manipulação de arrays
    DataHolder dh = new DataHolder(3);
    dh.set(0, 10);
    dh.set(1, 20);
    dh.set(2, 30);
    print("Value at index 1: " + dh.get(1));

    // 7. Controle de fluxo
    int i = 0;
    while (i < 3)
    {
      print("While loop: i=" + i);
      i = i + 1;
    }

    // 8. Expressões complexas
    int result = (b.calculate(2, 3) + MathUtil.square(4)) * 2;
    print("Complex result: " + result);

    // 9. Operações boolas
    bool test = (10 > 5) && (3 == 3) || false;
    print("bool test: " + test);

    // 10. Acesso a método via casting
    ((Derived)d).special();

    // 11. Array como objeto
    int arr[];
    malloc(arr, 10);
    arr[0] = 100;
    arr[1] = 200;
    print("Array value: " + arr[1]);

    // 12. Null safety check
    Base nullObj = null;
    if (nullObj == null)
    {
      print("Null object detected");
    }
  }
}

class Derived
{
  // 13. Sobrecarga de métodos
  void testThis()
  {
    print("This.x = " + this.x);
    this.x = 20;
    print("Modified this.x = " + this.x);
  }
}

// 14. Classe sem herança
class Simple
{
  void execute()
  {
    print("Simple class executed");
  }
}