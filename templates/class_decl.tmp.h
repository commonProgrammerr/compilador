// File: templates/class_decl.tmp.h
#define IMPEMENTATION_%(name)s_EXTENDS_%(inherence)s
#ifndef IMPEMENTATION_%(name)s_H
#define IMPEMENTATION_%(name)s_H
typedef struct { %(atributes)s } %(name)s;
%(name)s* %(name)s_new();
void %(name)s_delete(%(name)s* this);
%(inherence)s* %(name)s_super(%(name)s* this);
%(constructor)s
%(methods)s
#endif // IMPEMENTATION_%(name)s_H