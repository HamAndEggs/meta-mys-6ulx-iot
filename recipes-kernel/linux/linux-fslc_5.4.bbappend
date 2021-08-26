COMPATIBLE_MACHINE .= "|mys-6ulx-iot"

SUMMARY = "Linux Kernel tweak to build dts file and other changes"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Device tree changes
#SRC_URI += "file://mys-6ulx-iot.dts;subdir=git/arch/arm/boot/dts"


SRC_URI += "file://0001-set-display-mode.patch"
