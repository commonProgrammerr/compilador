#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define teste
int x = 12;
const char * text = "texto";
void printf() {
printf("Base: %d, %s",x,text);
}
// File: Base_1017a91d_class_decl.c
#define IMPEMENTATION_Base_1017a91d_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Base_1017a91d_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_Base_1017a91d_EXTENDS_None
    int x;
const char * text;
} Base_1017a91d;

Base_1017a91d* Base_1017a91d_constructor(void) {
    Base_1017a91d* this = (Base_1017a91d*)malloc(sizeof(Base_1017a91d));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Base_1017a91d\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Base_1017a91d)); // Initialize memory to zero
    {
this->x = 10;
this->text = "base";
printf("Base constructor called");
}
    return this;
}

void Base_1017a91d_printf(Base_1017a91d* this) {
printf("Base: %d, %s",this->x,this->text);
}

int Base_1017a91d_calculate(Base_1017a91d* this, int a, int b) {
return a * b + this->x;
}

// File: Derived_1017aba1_class_decl.c
#define IMPEMENTATION_Derived_1017aba1_EXTENDS_Base_1017a91d
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Derived_1017aba1_EXTENDS_None
    Base_1017a91d* super; 
    #endif // IMPEMENTATION_Derived_1017aba1_EXTENDS_None
    bool flag;
} Derived_1017aba1;

Derived_1017aba1* Derived_1017aba1_constructor(void) {
    Derived_1017aba1* this = (Derived_1017aba1*)malloc(sizeof(Derived_1017aba1));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Derived_1017aba1\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Derived_1017aba1)); // Initialize memory to zero
    
    return this;
}

void Derived_1017aba1_printf(Derived_1017aba1* this) {
printf("Derived: %s",this->super->x);
if (this->flag) {
printf("Flag is true");
}
}

void Derived_1017aba1_special(Derived_1017aba1* this) {
printf("Special method");
}

// File: MathUtil_1017ecc2_class_decl.c
#define IMPEMENTATION_MathUtil_1017ecc2_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_MathUtil_1017ecc2_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_MathUtil_1017ecc2_EXTENDS_None
    
} MathUtil_1017ecc2;

MathUtil_1017ecc2* MathUtil_1017ecc2_constructor(void) {
    MathUtil_1017ecc2* this = (MathUtil_1017ecc2*)malloc(sizeof(MathUtil_1017ecc2));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for MathUtil_1017ecc2\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(MathUtil_1017ecc2)); // Initialize memory to zero
    
    return this;
}

int MathUtil_1017ecc2_square(MathUtil_1017ecc2* this, int n) {
return n * n;
}

int MathUtil_1017ecc2_factorial(MathUtil_1017ecc2* this, int n) {
if (n <= 1) return 1;
return n * MathUtil_1017ecc2_factorial(this, n - 1);
}

// File: DataHolder_1017ee27_class_decl.c
#define IMPEMENTATION_DataHolder_1017ee27_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_DataHolder_1017ee27_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_DataHolder_1017ee27_EXTENDS_None
    int values[];
} DataHolder_1017ee27;

DataHolder_1017ee27* DataHolder_1017ee27_constructor(int size) {
    DataHolder_1017ee27* this = (DataHolder_1017ee27*)malloc(sizeof(DataHolder_1017ee27));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for DataHolder_1017ee27\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(DataHolder_1017ee27)); // Initialize memory to zero
    {
malloc(this->values,size);
}
    return this;
}

void DataHolder_1017ee27_set(DataHolder_1017ee27* this, int index, int value) {
this->values[index] = value;
}

int DataHolder_1017ee27_get(DataHolder_1017ee27* this, int index) {
return this->values[index];
}

// File: Derived2_1017efee_class_decl.c
#define IMPEMENTATION_Derived2_1017efee_EXTENDS_Derived_1017aba1
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Derived2_1017efee_EXTENDS_None
    Derived_1017aba1* super; 
    #endif // IMPEMENTATION_Derived2_1017efee_EXTENDS_None
    
} Derived2_1017efee;

Derived2_1017efee* Derived2_1017efee_constructor(void) {
    Derived2_1017efee* this = (Derived2_1017efee*)malloc(sizeof(Derived2_1017efee));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Derived2_1017efee\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Derived2_1017efee)); // Initialize memory to zero
    
    return this;
}

void Derived2_1017efee_testThis(Derived2_1017efee* this) {
;
}

// File: Simple_1018082f_class_decl.c
#define IMPEMENTATION_Simple_1018082f_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Simple_1018082f_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_Simple_1018082f_EXTENDS_None
    
} Simple_1018082f;

Simple_1018082f* Simple_1018082f_constructor(void) {
    Simple_1018082f* this = (Simple_1018082f*)malloc(sizeof(Simple_1018082f));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Simple_1018082f\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Simple_1018082f)); // Initialize memory to zero
    
    return this;
}

void Simple_1018082f_execute(Simple_1018082f* this) {
printf("Simple class executed");
}

// File: Main_10180875_class_decl.c
#define IMPEMENTATION_Main_10180875_EXTENDS_None
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_Main_10180875_EXTENDS_None
    None* super; 
    #endif // IMPEMENTATION_Main_10180875_EXTENDS_None
    
} Main_10180875;

Main_10180875* Main_10180875_constructor(void) {
    Main_10180875* this = (Main_10180875*)malloc(sizeof(Main_10180875));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for Main_10180875\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(Main_10180875)); // Initialize memory to zero
    
    return this;
}

void Main_10180875_test(Main_10180875* this) {
;
}

void Main_10180875_run(Main_10180875* this) {
Main_10180875_test(this);
MathUtil_1017ecc2* math = MathUtil_1017ecc2_constructor();
Base_1017a91d* b = Base_1017a91d_constructor();
Base_1017a91d_printf(b);
Base_1017a91d* d = Derived_1017aba1_constructor();
Base_1017a91d_printf(d);
printf("Calculation: %d",Base_1017a91d_calculate(b, 3,4));
printf("Square: %d",MathUtil_1017ecc2_square(math, 5));
printf("Factorial: %d",MathUtil_1017ecc2_factorial(math, 5));
Derived2_1017efee* d2 = Derived2_1017efee_constructor();
Derived2_1017efee_testThis(d2);
DataHolder_1017ee27* dh = DataHolder_1017ee27_constructor(3);
DataHolder_1017ee27_set(dh, 0,10);
DataHolder_1017ee27_set(dh, 1,20);
DataHolder_1017ee27_set(dh, 2,30);
printf("Value at index 1: %d",DataHolder_1017ee27_get(dh, 1));
int i = 0;
while (i < 3) {
printf("While loop: i=%d",i);
i = i + 1;
}
MathUtil_1017ecc2* math = MathUtil_1017ecc2_constructor();
int result = (Base_1017a91d_calculate(b, 2,3) + MathUtil_1017ecc2_square(math, 4)) * 2;
printf("Complex result: %d",result);
bool test = (10 > 5) && (3 == 3) || false;
printf("bool test: %d",test);
int arr[10];
arr[0] = 100;
arr[1] = 200;
printf("Array value: %d",arr[1]);
Base_1017a91d* NULLObj = NULL;
if (NULLObj == NULL) {
printf("NULL object detected");
}
for (int i = 10; i < 10; i++) {
printf("times %d",i);
}
}
