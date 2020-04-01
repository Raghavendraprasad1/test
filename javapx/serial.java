serialization==is a conversion process from object to byte stream. also known as
marshalling,flattering or pickling.these byte can be transfer to n/w or save into file.

deserialization== opposite to serialization.

ObjectOutputStream=is responsible for serialization process. it convert object into
sequence of byte nd then send it to o/p stream.
>> to write object call to>> writeObject() method. 
>> if we declare a variable 'transient' then it wll nt be serializable.

>>objecti/pstream is responsible for deserialization using readObject().


------------------------------------------------------------------------------------------

printstream==is used to write data to o/p stream such as fileo/pstream or console.
it convert value into bytes.
>>print(value)
>>println()
>>printf(format,value)

--------------------------------------------------------------------------------------------

CHARACTER ORIENTED STREAM :

>>reader is a to most abstract class 
i/pstreamreader  is usd to read chareacter data from byte stream such 
as file i/p stream .
1)read()>> 

-------------------------------------------------------------------------------------------------
filereader class :
is used to read data from file directly.
filereader fr=new filereader (filename);
-----------------------------------------------------------------------------------------------
PRINTWRITER;;;
1)PRINT(VALUE)
2)println()







