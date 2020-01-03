SUMMARY = "Utility to test hardware PWM for servo and ESC control"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c7e37b3afebe0618d1c51985c5fb3f61"

DEPENDS += "bcm2835"
#RDEPENDS += "bcm2835"


SRCREV = "2df86ae6d4880e07565e7b3ded070b8348d2725c"
SRC_URI = "git://github.com/luckynrslevin/rover_drivingcontrol.git"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
    install -d ${D}${bindir}
    install -m 755 drivingcontrol ${D}${bindir}
}

FILES_${PN} = "${bindir}"
