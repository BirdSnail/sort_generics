#问题
##为什么编译器检测不出类型？
打开文件
```text
src/main/java/com/birdsnail/sort/StreamSort.java
```
`sort1`方法基于name进行倒序排序，使用的方法引用，可以正常工作。  
`sort2`同样进行倒叙排序，但是用的是普通的lamdal表达式，在调用`reversed()`方法不能通过编译。编译器不能进行类型推断，认为排序的元素类型是`Object`这是为什么？
