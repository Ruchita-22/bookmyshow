**Annodation Used**
    
    for entity
        @Entity
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
    for time
        @LastModifiedDate
        @Temporal(value = TemporalType.TIMESTAMP)
        @LastModifiedDate
        @Temporal(value = TemporalType.TIMESTAMP)
    for Enum
        @Enumerated(EnumType.ORDINAL)
        @ElementCollection
    mapping

**Notes**

    Whenever one class hold a object of another class we need to put @ManyToOne, @OneToMany, @ManyToMany annodation

    For each entity class we should have repository class in general
    In this case save independent obj first then depenedent objects

    If we are using cascade = Cascade.ALL so we dont need repository class for ach entity.
    Just save the depened obj and it will save the required object too
    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)

Try to avoid bidirection mapping it generally create prob.


**To remove redundancy between relationship**

    mappedBy - used to stop creating mapping table
    
    **In bidirection**

    @OneToMany(mappedBy = """) - 
        as OneToMany create mapping table so to stop it we use mappedBy
        with mappedBy no mapping table will create

    @ManyToOne
    @JoinColumn(name = "book_id") // not mandatory - it is basically used to give col name

        pk of 1 side go to many side

    @JoinColumn(name = "region_id") 
        this we can put in anywhere @ManyToOne, @OneToMany
        In @JoinColumn pk oh 1 side will come

**StackOverflowError**

    A StackOverflowError in a bidirectional mapping scenario typically occurs 
    when you have a cyclic reference between entities, and the default behavior 
    of serialization or certain operations (like toString()) leads to an infinite loop. 
    This is especially common when printing or converting entities to strings.
    
    To resolve the StackOverflowError issue, you need to break the cyclic reference 
    or customize the way the entities are converted to strings.

    The @JsonManagedReference and @JsonBackReference annotations help break the loop 
    during JSON serialization.

    @JsonManagedReference - Parent side
    @JsonBackReference - child side



