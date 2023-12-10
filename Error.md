Error

TransientPropertyValueException

    The exception org.hibernate.TransientPropertyValueException: object references an 
    unsaved transient instance typically occurs when you have an entity (in this case, 
    Show) that has a reference to another entity (in this case, Movie), and the Movie 
    entity is not saved to the database before saving the Show entity.

    To resolve this issue, you need to make sure that you save the referenced Movie entity
    before saving the Show entity. Here are a few steps you can take to address this problem:

SQLSyntaxErrorException

    The error message indicates a syntax error in your SQL statement when trying to execute
    it against the MySQL database. The problem is likely related to the use of the reserved 
    keyword show, which is a MySQL reserved keyword.

    In MySQL, SHOW is a reserved keyword used for various operations related to the 
    database schema, and using it as a table name requires special handling.

StackOverflowError

    The error message you provided indicates a StackOverflowError during the 
    serialization process of a JSON response in a Spring application. The key part of the
    error is:
    This error commonly occurs when you have a circular reference in your object graph, 
    and the JSON serializer (likely Jackson, based on the stack trace) is unable to 
    handle it, resulting in a stack overflow.