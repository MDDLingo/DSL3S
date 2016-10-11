A **Simulation** requires in first place a set of input variables that provide information:

* **Spatial** variables are spatial information layers that have
some sort of impact on the dynamics of a simulation, e.g. slope that deters
urban sprawl or biomass that feeds a wildfire.

* **Global** variables, information that is constant across the whole space of simulation.

![DSL3S meta-model - Simulation View](http://ldesousa.github.io/DSL3S/images/Simulation_View.PNG)

**Animat** is a term coined by Wilson [1991] meaning *artificial animal*. In DSL3S this concept is used for all spatial elements taking part ins a simulation that change or induce change in their surroundings. Examples can be: fire (in a wildfire model) or predators (in a population dynamics model). 

![DSL3S meta-model - Scenario View](http://ldesousa.github.io/DSL3S/images/Scenario_View.PNG)

An Animat is composed by a set of **Attributes** that describe each instance at a certain moment in time. 

**Operations** are several process through which an animat may act and react to the environment. They are used to determine the life cycle of the animat and how it interacts with other elements of a simulation: global and spatial variables and other animats.

![DSL3S meta-model - Animat View](http://ldesousa.github.io/DSL3S/images/Animat_View.PNG)

![DSL3S meta-model - Animat Interactions View](http://ldesousa.github.io/DSL3S/images/Animat_Interactions_View.PNG)

Each of these elements identified in the meta-model are captured as stereotypes in a UML profile that implements DSL3S. 