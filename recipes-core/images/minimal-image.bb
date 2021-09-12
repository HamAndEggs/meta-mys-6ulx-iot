#
# minimal imx6ull image recipe
#
DESCRIPTON = "minimal imx6ull image"
SUMMARY = "minimal imx6ull headless image"
LICENSE = "MIT"
#LICENSE = "Closed"

inherit core-image

IMAGE_INSTALL_append += " net-tools"
IMAGE_INSTALL_append += " util-linux"
IMAGE_INSTALL_append += " ntpdate"

IMAGE_INSTALL_append += " netbase"
IMAGE_INSTALL_append += " init-ifupdown"

IMAGE_INSTALL_append += " alsa-utils v4l-utils gstreamer1.0 freetype"

IMAGE_INSTALL_append += " u-boot-fw-utils"
IMAGE_INSTALL_append += " libgpiod"


IMAGE_INSTALL_append += "imx-kobs \
    tslib-calibrate \
    tslib-conf \
    tslib-tests \
    bzip2 \
    gzip \
    canutils \
    mtd-utils \
    mtd-utils-ubifs \
    vlan \
    tar \
    ethtool \
    evtest \
    i2c-tools \
    iperf3 \
    iproute2 \
    iputils \
    udev-extraconf \
    udev-rules-imx \
    openssh \
    openssl \
    hostapd "

# Stuff from meta-ham-and-eggs
IMAGE_INSTALL_append += " build-info"