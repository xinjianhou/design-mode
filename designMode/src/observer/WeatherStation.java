package observer;

/**
 *
 * 观察者模式又称为 发布-订阅模式，定义了对象之间一对多依赖关系，当目标对象(被观察者)的状态发生改变时，
 * 它的所有依赖者(观察者)都会收到通知。一个观察目标可以对应多个观察者，而这些观察者之间没有相互联系，
 * 所以能够根据需要增加和删除观察者，使得系统更易于扩展，符合开闭原则；并且观察者模式让目标对象和观察者松耦合，
 * 虽然彼此不清楚对方的细节，但依然可以交互，目标对象只知道一个具体的观察者列表，但并不认识任何一个具体的观察者，
 * 它只知道他们都有一个共同的接口。
 *
 *         但观察者模式的缺点在于如果存在很多个被观察者的话，那么将需要花费一定时间通知所有的观察者，
 *         如果观察者与被观察者之间存在循环依赖的话，那么可能导致系统崩溃，
 *         并且观察者模式没有相应的机制让观察者知道被观察对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 78, 40.4f);
    }
}
