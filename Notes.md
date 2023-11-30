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
