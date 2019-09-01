

把鸭子的行为抽象成接口 
    fly 飞行接口
        具体的飞行方式BadFly、GoodFly、NoFly
    quack 叫声接口
        具体的叫声方式GaGa、GeGe、No

Duck鸭子抽象类中包含
    这两种行为接口和一个display()抽象方法
    还可以动态设置这两种接口的行为setFly(fly fly)、setquack(quack quack)
    
GreenDuck和RedDuck的构造方法里传入各自行为的实现类，进行策略选取具体方式
