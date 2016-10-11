### Pre-requisites

To follow this guide and use DSL3S, [Java](https://www.java.com/en/) and [Eclipse Kepler](http://www.eclipse.org/kepler/) must already be present in the system. Since these are relatively common software, their installation is considered to be beyond this guide.

The models generated with MDD3S have been successfully tested with Java versions 6, 7 and 8. Java 5 was never tested but is likely to be functional too. Programmes generated with MDD3S are not expected to run on Java versions 4 or earlier.

Eclipse Kepler has been superseded by Eclipse Luna, follow [these instructions for this later release](https://github.com/MDDLingo/DSL3S/wiki/Installation-on-Eclipse-Luna).

### Acceleo and Papyrus plug-ins

In order to use Model Driven Development in Eclipse two specific plug-ins are required:

* [Papyrus](https://www.eclipse.org/papyrus/) - for graphical UML based modelling;

* [Acceleo](https://www.eclipse.org/acceleo/) - for code generation from models.

These can be installed from the general update site for Eclipse Kepler:

1. Go to _Help_ -> _Install new software_  and select as update site "Kepler - http://download.eclipse.org/releases/kepler". If the Kepler update site is not yet registered click _Add..._ and insert "Kepler" for the name and the address above for _Location_; then click _OK_.

2. Expand the _Modelling_ item in the plug-in list and select _Acceleo_ and _Papyrus_. Click _Next_ and wait for the dependencies to be calculated. Go through the following menus and accept the Licences presented.

3. After restarting, Eclipse will have a new item in the _Help_ menu: _Install Papyrus Additional Components_, click it. In the dialogue that comes up select _View Stylesheets_ and click _Next_; follow through the remaining steps and restart Eclipse again.

### DSL3S plug-ins

The DSL3S UML profile and the MDD3S code generator are available as a plug-in to Eclipse Kepler. The install process is similar:

 1. Go to _Help_ -> _Install new software_  and click _Add..._. Insert "DSL3S" for _Name_ and the following address: http://mddlingo.github.io/DSL3S/updates/4.3.kepler/ for _Location_; then click _OK_. 

 2. Select _DSL3S_ and click _Next_ ; wait for the dependencies to be calculated and go on through the following menus accepting the Licence.

 3. Restart Eclipse.

### Software dependencies

The models generated with MDD3S depend on several libraries that must be present in the system:

* [MASON](http://cs.gmu.edu/~eclab/projects/mason/) - the multi-agent simulation toolkit.

* [GeoMASON](http://cs.gmu.edu/%7Eeclab/projects/mason/extensions/geomason/) - an extension to MASON that bridges simulations with geo-spatial data.

* [Java Topology Suite](http://www.vividsolutions.com/jts/jtshome.htm) - contains core geo-spatial data manipulation functionality required by GeoMASON. 

* [OpenCSV](http://sourceforge.net/projects/opencsv/) - contains functionality to read CSV data into models.

For convenience, the JAR files for these libraries can be downloaded in a single archive from [here](http://mddlingo.github.io/DSL3S/dsl3s-dependencies.zip).

Unpack it to some handy place; In Debian based systems this can be _/usr/share/java_, but it can be somewhere else. To run programmes generated with MDD3S these libraries must be in the Java CLASSPATH.
















