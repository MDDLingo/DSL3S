## Abstract

DSL3S is a model-driven domain specific language for Spatial
Simulation in the field of Geographic Information Systems (GIS). DSL3S synthesises relevant concepts of spatial simulation in a UML profile, thus allowing the design of simulation models through the arrangement of graphical elements. An implementation of this language, named MDD3S, has been developed relying on Model Driven Development (MDD) tools distributed with the Eclipse IDE. MDD3S includes a code generation infrastructure, that produces ready to run 
simulations from DSL3S models, supported by the MASON simulation tool-kit.

This project is part of the doctoral studies on Computer Science by Luís de Sousa (student id D44155) at the [Instituto Superior Técnico](https://fenix.ist.utl.pt/cursos/deic?locale=en_EN). For more details on the project the following 
article is recommended:

de Sousa, L. and da Silva, A. R., “[Preliminary Design and Implementation of DSL3S](http://scholar.google.nl/citations?view_op=view_citation&hl=en&user=nQpZSTYAAAAJ&citation_for_view=nQpZSTYAAAAJ:u5HHmVD_uO8C)”, CAMUSS - International Symposium on Cellular Automata Modelling for Urban and Spatial Systems, Oporto, November 2012.
 

## Approach

DSL3S is an application of the [MDD](https://github.com/MDDLingo/DSL3S/wiki/Model-Driven-Development) philosophy to the field of Spatial
Simulation, as an alternative way to facilitate the usage of its methods by non programmers. By raising the level of abstraction at which
development takes place, this approach can facilitate the communication between
programmers and analysts and other stakeholders lacking programming knowledge. It can also allow prototyping by non-programmers. By
detaching model development from specific technologies, it can improve 
interoperability with geo-spatial data, generating the appropriate code
as needed. It can further lay the foundations for a standard language in the
field, as successful efforts in parallel fields have proved, like
[SysML](http://www.sysml.org/) or
[ModelicaML](https://www.openmodelica.org/index.php/home/tools/134).

This project employs the [Model-Drive Architecture](http://www.omg.org/mda/)
(MDA) methodology, the concrete MDD approach specified by the Object Management Group
(OMG). The UML 2.0 modelling language allows the extension of its core
primitives (graphical elements, links, etc) through specialisation for different
application domains. This is achieved with the definition of a
UML Profile, a collection of _stereotypes_, _properties_ and
_constraints_. Stereotypes are specialisations of existing UML model
elements, defining new elements representing narrower abstractions. A
semantically related set of stereotypes, specified by properties and
restrictions, can thus be used to customise UML into a new specialised language
dedicated to a certain domain.

The vision of this project is to have GIS analysts prototyping spatial
simulation models with graphical DSL3S diagrams, that can be parametrised and
tuned to the specific application domain. These models are then feed to a code
generation facility to produce a ready-to-run simulation based on the
popular simulation toolkit MASON for basic validation. From there analysts
can tune the model at the conceptual level using DSL3S constructs in an
iterative process.

## Tool support

[Model Driven Development for Spatial Simulation Scenarios](https://github.com/MDDLingo/DSL3S/wiki/Code-generation-with-MDD3S)
(MDD3S) is the name of the prototype framework developed to support the DSL3S
language. MDD3S relies solely on open source tools: 

(i) [**Papyrus**](http://www.eclipse.org/modeling) - an Eclipse add-on for UML modelling; 

(ii) [**Acceleo**](http://www.acceleo.org/pages/introduction/en) - another Eclipse add-on supporting model-to-code generation templates; 

(iii) [**MASON**](http://cs.gmu.edu/ eclab/projects/mason) - a simulation framework used as a library by the code generated. 

Papyrus is a graphical editor for the UML language based on the [Eclipse
Modelling Framework](http://www.eclipse.org/modeling/emf/) (EMF). It allows the edition and visualisation of structured models defined with the XMI language, providing a set of Java classes that facilitate its
manipulation. Papyrus evolved to support the development of _ad hoc_
DSLs, through the definition of UML profiles. It is presently close to fully
support version 2 of the UML language.

Acceleo is an open source code generator also built on EMF. Acceleo interprets templates written with the MOF [Model to Text
Transformation
Language](8
http://www.omg.org/spec/MOFM2T/1.0/)
(MOFM2T), also an OMG standard. It fully supports code generation from
meta-models, identifying stereotypes applied on classes and providing access to its
properties. 

MASON (acronym for "Multi-Agent Simulator Of Neighbourhoods") aims to be a
light-weight, highly portable, multi-purpose agent-based modelling package. It is fully written in Java and open source, and is among
the most popular and performing libraries for spatial
simulation. [GeoMASON](http://cs.gmu.edu/ eclab/projects/mason/extensions/geomason/)
is an extension that provides Java objects to deal specifically with
geo-referenced data.
Input and output functionality is available for both raster and vector datasets,
relying on third party packages: the [Java Topology
Suite](http://www.vividsolutions.com/JTS/JTSHome.htm), [GeoTools](http://www.geotools.org/) for
vector input and output and
[GDAL](http://www.gdal.org/) for raster
formats.

## Licence

DSL3S is released under the [EUPL 1.1](http://joinup.ec.europa.eu/software/page/eupl) licence. 

## Installation

Follow the [installation guide](https://github.com/MDDLingo/DSL3S/wiki/Installation) to start using DSL3S. 
