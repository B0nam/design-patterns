package com.bonam.designpatterns.structural.decorator.decorator

import com.bonam.designpatterns.structural.decorator.component.Beverage

abstract class BeverageDecorator(protected val beverage: Beverage) : Beverage
