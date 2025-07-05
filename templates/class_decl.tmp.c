// File: %(type_name)s_class_decl.c
#define IMPEMENTATION_%(type_name)s_EXTENDS_%(inherence)s
typedef struct {
    char _version;
    #ifndef IMPEMENTATION_%(type_name)s_EXTENDS_None
    %(inherence)s* super; 
    #endif // IMPEMENTATION_%(type_name)s_EXTENDS_None
    %(attributes)s
} %(type_name)s;

%(constructor)s

%(methods)s
