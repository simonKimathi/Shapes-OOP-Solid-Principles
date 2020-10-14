# Shapes-OOP-Solid-Principles  
Project has 3 interfaces i,e  
``ShapeI`` that contains calculate area method  
``Shape2DI`` that contains calculate perimeter method  
``Shape3DI`` that contains calculate volume method  

Each class has Calculate area method, prompt and calculate volume or perimeter according to the shape and a parameterless Constructor that calls prompt method.  
`main.java` class has switch in a while loop to create appropriate instances and store the toString method of the object in an arraylist.  
`triangle` class and `square` class inherit from ``rectangle`` class.  
`cube` class inherit from ``box`` class.    
`Ellipse` class inherit from ``circle`` class.  
     
if user decides to exit the results are printed(`each instance toString method`). 