// File: class_%(name)s_.h
#define IMPEMENTATION_%(name)s_EXTENDS_%(inherence)s
#ifndef IMPEMENTATION_%(name)s_H
#define IMPEMENTATION_%(name)s_H
typedef struct {
    #ifndef IMPEMENTATION_%(name)s_EXTENDS_None
    %(inherence)s super; 
    #endif // IMPEMENTATION_%(name)s_EXTENDS_None
    %(attributes)s;
} %(name)s;
#ifndef IMPEMENTATION_%(name)s_EXTENDS_None
%(inherence)s* %(name)s_super(%(name)s* this);
#endif
%(constructor)s;
%(methods)s;
#endif // IMPEMENTATION_%(name)s_H
