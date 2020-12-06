### JPA stands for - Java Persistence API
### What is Hibernate? 
A ORM framework which interacts with Java object and relational objects. Supports transaction, ACID properties.

### Persistence Object 
* First Level Cache : Better performance reduce no of queries to hit the DB `evict()` for reloading and `clear()` to remove. Bounded to session object
* Second Level Cache : Default disabled. through sessionFactory and it's thread safe.

### Annotations
* @Entity,
* @Table(name, uniqueConstraints)
* @Id
* @GeneratedValue(strategy=GenerationType.AUTO|IDENTITY|SCHEMA|TABLE)
* @Column
* @OneToOne
* @OneToMany
* @ManyToMany
* @JoinColumn
* @JoinTable

### Application properties
* spring.jpa.properties.hibernate.dialect
* spring.jpa.properties.hibernate.ddl-auto

### Repository interface class
implements JpaRepository<T,L>

### Connection Pools
c3p0 - opensource connection pooling

## Transactions
```java
Transaction transaction = null;
transaction = session.beginTransaction()
transaction.commit()
transaction.rollback() // On exception and if transaction is != null
```
### DB migration
* `Flyway` - Open source db migration tool
* spring.flyway.baseline-on-migrate=true


