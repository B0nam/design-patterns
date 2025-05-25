# Observer

Observer é um padrão de projeto comportamental que define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus observadores são notificados e atualizados automaticamente.

Imagine uma estação meteorológica que coleta dados de temperatura. Diversos displays (como app mobile, painéis públicos ou alertas automáticos) precisam ser atualizados sempre que a temperatura muda.

| Subject        | Observers          |
| -------------- | ------------------ |
| WeatherStation | TemperatureDisplay |
|                | StatisticsDisplay  |
|                | AlertSystem        |
