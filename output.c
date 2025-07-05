#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define teste
int x = 12;
const char * text = "texto";
void printf() {
printf("Base: %d, %s",x,text);
}
// File: Base_1041062e_class_decl.c
#define IMPEMENTATION_Base_1041062e_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Base_1041062e_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_Base_1041062e_EXTENDS_None
    int x;
const char * text;
} Base_1041062e;

Base_1041062e* Base_1041062e_constructor(void) {
    Base_1041062e* this = (Base_1041062e*)malloc(sizeof(Base_1041062e));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Base_1041062e\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Base_1041062e)); // Initialize memory to zero
    {
this->x = 10;
this->text = "base";
printf("Base constructor called");
}
    return this;
}

void Base_1041062e_printf(Base_1041062e* this) {
printf("Base: %d, %s",this->x,this->text);
}

int Base_1041062e_calculate(Base_1041062e* this, int a, int b) {
return a * b + this->x;
}

// File: Derived_104194c2_class_decl.c
#define IMPEMENTATION_Derived_104194c2_EXTENDS_Base_1041062e
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Derived_104194c2_EXTENDS_None
    Base_1041062e* super; 
    #endif // IMPEMENTATION_Derived_104194c2_EXTENDS_None
    bool flag;
} Derived_104194c2;

Derived_104194c2* Derived_104194c2_constructor(void) {
    Derived_104194c2* this = (Derived_104194c2*)malloc(sizeof(Derived_104194c2));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Derived_104194c2\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Derived_104194c2)); // Initialize memory to zero
    
    return this;
}

void Derived_104194c2_printf(Derived_104194c2* this) {
printf("Derived: %s",this->super->x);
if (this->flag) {
printf("Flag is true");
}
}

void Derived_104194c2_special(Derived_104194c2* this) {
printf("Special method");
}

// File: MathUtil_104195da_class_decl.c
#define IMPEMENTATION_MathUtil_104195da_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_MathUtil_104195da_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_MathUtil_104195da_EXTENDS_None
    
} MathUtil_104195da;

MathUtil_104195da* MathUtil_104195da_constructor(void) {
    MathUtil_104195da* this = (MathUtil_104195da*)malloc(sizeof(MathUtil_104195da));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for MathUtil_104195da\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(MathUtil_104195da)); // Initialize memory to zero
    
    return this;
}

int MathUtil_104195da_square(MathUtil_104195da* this, int n) {
return n * n;
}

int MathUtil_104195da_factorial(MathUtil_104195da* this, int n) {
if (n <= 1) return 1;
return n * MathUtil_104195da_factorial(this, n - 1);
}

// File: DataHolder_1041973f_class_decl.c
#define IMPEMENTATION_DataHolder_1041973f_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_DataHolder_1041973f_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_DataHolder_1041973f_EXTENDS_None
    int values[];
} DataHolder_1041973f;

DataHolder_1041973f* DataHolder_1041973f_constructor(int size) {
    DataHolder_1041973f* this = (DataHolder_1041973f*)malloc(sizeof(DataHolder_1041973f));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for DataHolder_1041973f\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(DataHolder_1041973f)); // Initialize memory to zero
    {
malloc(this->values,size);
}
    return this;
}

void DataHolder_1041973f_set(DataHolder_1041973f* this, int index, int value) {
this->values[index] = value;
}

int DataHolder_1041973f_get(DataHolder_1041973f* this, int index) {
return this->values[index];
}

// File: Derived2_1041b4de_class_decl.c
#define IMPEMENTATION_Derived2_1041b4de_EXTENDS_Derived_104194c2
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Derived2_1041b4de_EXTENDS_None
    Derived_104194c2* super; 
    #endif // IMPEMENTATION_Derived2_1041b4de_EXTENDS_None
    
} Derived2_1041b4de;

Derived2_1041b4de* Derived2_1041b4de_constructor(void) {
    Derived2_1041b4de* this = (Derived2_1041b4de*)malloc(sizeof(Derived2_1041b4de));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Derived2_1041b4de\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Derived2_1041b4de)); // Initialize memory to zero
    
    return this;
}

void Derived2_1041b4de_testThis(Derived2_1041b4de* this) {
;
}

// File: Simple_1041b516_class_decl.c
#define IMPEMENTATION_Simple_1041b516_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Simple_1041b516_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_Simple_1041b516_EXTENDS_None
    
} Simple_1041b516;

Simple_1041b516* Simple_1041b516_constructor(void) {
    Simple_1041b516* this = (Simple_1041b516*)malloc(sizeof(Simple_1041b516));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Simple_1041b516\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Simple_1041b516)); // Initialize memory to zero
    
    return this;
}

void Simple_1041b516_execute(Simple_1041b516* this) {
printf("Simple class executed");
}

// File: Main_1041b555_class_decl.c
#define IMPEMENTATION_Main_1041b555_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Main_1041b555_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_Main_1041b555_EXTENDS_None
    
} Main_1041b555;

Main_1041b555* Main_1041b555_constructor(void) {
    Main_1041b555* this = (Main_1041b555*)malloc(sizeof(Main_1041b555));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Main_1041b555\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Main_1041b555)); // Initialize memory to zero
    
    return this;
}

void Main_1041b555_test(Main_1041b555* this) {
;
}

void Main_1041b555_run(Main_1041b555* this) {
Main_1041b555_test(this);
MathUtil_104195da* math = MathUtil_104195da_constructor();
Base_1041062e* b = Base_1041062e_constructor();
Base_1041062e_printf(b);
Base_1041062e* d = Derived_104194c2_constructor();
Base_1041062e_printf(d);
printf("Calculation: %d",Base_1041062e_calculate(b, 3,4));
printf("Square: %d",MathUtil_104195da_square(math, 5));
printf("Factorial: %d",MathUtil_104195da_factorial(math, 5));
Derived2_1041b4de* d2 = Derived2_1041b4de_constructor();
Derived2_1041b4de_testThis(d2);
DataHolder_1041973f* dh = DataHolder_1041973f_constructor(3);
DataHolder_1041973f_set(dh, 0,10);
DataHolder_1041973f_set(dh, 1,20);
DataHolder_1041973f_set(dh, 2,30);
printf("Value at index 1: %d",DataHolder_1041973f_get(dh, 1));
int i = 0;
while (i < 3) {
printf("While loop: i=%d",i);
i = i + 1;
}
MathUtil_104195da* math = MathUtil_104195da_constructor();
int result = (Base_1041062e_calculate(b, 2,3) + MathUtil_104195da_square(math, 4)) * 2;
printf("Complex result: %d",result);
bool test = (10 > 5) && (3 == 3) || false;
printf("bool test: %d",test);
int arr[10];
arr[0] = 100;
arr[1] = 200;
printf("Array value: %d",arr[1]);
Base_1041062e* NULLObj = NULL;
if (NULLObj == NULL) {
printf("NULL object detected");
}
for (int i = 10; i < 10; i++) {
printf("times %d",i);
}
}
