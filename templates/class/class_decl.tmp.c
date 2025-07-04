// File: templates/class_decl.tmp.c

#include <stdlib.h>
#include <string.h>
#include <stdio.h>

%(name)s* %(name)s_new() {
    %(name)s* this = (%(name)s*)malloc(sizeof(%(name)s));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for %s\n", "%(name)s");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(%(name)s)); // Initialize memory to zero
    return this;
}

#ifndef IMPEMENTATION_%(name)s_EXTENDS_None 
%(inherence)s* %(name)s_super(%(name)s* this) {
    if (this == NULL) {
        fprintf(stderr, "Attempted to access super of a NULL %s\n", "%(name)s");
        return NULL;
    }
    return ((%(inherence)s) void*) this; // Cast to the superclass type
}
#endif

void %(name)s_delete(%(name)s* this) {
    if (this != NULL) {
        free(this);
    }
}