***********************************************************
************** Flex reference example *********************
***********************************************************

This is a Flex running example with many new technologies:

Maven
Flex
Graniteds
Spring
Spring-data-Jpa
Jpa2-Hibernate
Derby

It's working as a standalone application or in Eclipse IDE

**********************************************************
************** Standalone App ****************************
**********************************************************

***** Requierments **************************************
This project has been tested with Maven 3.0.
You just have to get Maven in your path.

**** Usage *********************************************
Open a command
Go to the root of the project
Run mvn clean install

Then 
cd newArchetypeTest/newArchetypeTest-java/newArchetypeTest-flexServer
mvn cargo:start -Ptomcat

Go to your browser and type http://localhost:8099/newArchetypeTest-flexServer


**********************************************************
*********** Eclipse integration **************************
********************************************************** 
  
  
***** Requierments **************************************
It has been tested with the following configuration:

Eclipse 3.7
FlashBuilder eclipse plugin 4.5
Spring IDE 2.7
GraniteBuilder 2.2.0
M2e for eclipse 1.0.0
Wtp + a tomcat 6 install

***** Usage *********************************************

Go to your tomcat server admin console (double clic on it in the server view) and check "publish module Contexts in a separate xml file"
Configure a new linked resources M2_REPO with your maven repository.

After importing and building project, you can now debug it with wtp and flashbuilder

**** Known limitations *******************************
After each java modification, you're forced to stop and restart tomcat server (atomikos limitation trying to re-create database).
It may be a miss configuration, tells me if you know a workaround: cmordant1@gmail.com

****   What do I expect *****************************

You can visit my website and comment project : http://helloworld.is-an-engineer.com
This example is a part of a future archetype with model to text, modularity, jms and bus integration, feel free to contact me if you're interested to contribute
You can send me money for the time you've gained, same adresse for my paypal account