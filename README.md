# SFC Editor
## Overview
### workspace-SfcEditor
workspace-SfcEditor is the Eclipse workspace that contains the sfc model project, build with the EMF, and the sfc editor project, build with the GEF.

### runtime-EclipseApplication
runtime-EclipseApplication is an automatically generated folder when the project 'sfcEditor' is run as *Eclipse Application*. This folder contains an example folder with an example chart.

## Start SfcEditor

To start the SfcEditor plugin, right click the `sfcEditor` folder and select `Run as` > `Eclipse Application`

## Use SfcEditor

First of all, in the sfcEditor plugin, a new Project has to be created.
Then a new `.sfc` file can be created by right click on the project folder > `New...` > `Other...` > `SFC Model`.
Choose a name for the new file and select `Sequential Function Chart` as Model Object of the new file.

# For further development
## Requirements
### IDE
[Eclipse-ide-rcp-and-rap-developers](https://www.eclipse.org/downloads/packages/release/2022-12/r/eclipse-ide-rcp-and-rap-developers)

### EMF

Install EMF via `Help` > `Install New Software...` menu entry in Eclipse. Select Modeling and install `EMF - Eclipse Modeling Framework SDK` and the `Ecore Diagram Editor (SDK)`. The second entry allows you to create models.
