## rover yocto

Project to build image for rover project based on yocto using docker.

## Prerequisite
Linux build system compatible for yocto, see https://www.yoctoproject.org/docs/3.0/mega-manual/mega-manual.html#required-packages-for-the-build-host


## Howto
clone repo:

    git clone --recurse-submodules https://github.com/luckynrslevin/rover_yocto.git

start yocto build:

    cd rover_yocto
    source src/poky/oe-init-build-env
    bitbake core-image-minimal
    
__You can go to sleep now, this will take very long!__
