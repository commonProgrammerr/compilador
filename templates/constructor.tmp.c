%(return_type)s %(name)s_constructor(%(params)s) {
    %(name)s* this = (%(name)s*)malloc(sizeof(%(name)s));
    if (this == NULL) {
        fprintf(stderr, "Memory allocation failed for %(name)s\n");
        exit(EXIT_FAILURE);
    }
    memset(this, 0, sizeof(%(name)s)); // Initialize memory to zero
    %(block)s
    return this;
}