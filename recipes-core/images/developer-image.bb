#
# minimal imx6ull image recipe
#
DESCRIPTON = "Developer imx6ull image"
SUMMARY = "Developer imx6ull image for application development"
LICENSE = "MIT"
#LICENSE = "Closed"

require recipes-core/images/minimal-image.bb


# Recipe for setting some meta data of the build enviroment, date and settings of the OS
INHERIT += "extrausers"
inherit extrausers
DEVELOPER_USER = "dev"
DEVELOPER_PW_MD5 = "ofcRU64Lriag6"

# Setup developer user
# If I do this right, after first login will be forced to set password
# So having developer as the password not bad. ;)
EXTRA_USERS_PARAMS = "  useradd ${DEVELOPER_USER}; \
                        usermod -p '${DEVELOPER_PW_MD5}' ${DEVELOPER_USER}; \
                        usermod -aG sudo,dialout,video,tty,input ${DEVELOPER_USER}; "


IMAGE_INSTALL_append += "htop"
IMAGE_INSTALL_append += "nano"
IMAGE_INSTALL_append += "samba"
IMAGE_INSTALL_append += "sudo"

IMAGE_INSTALL_append += "packagegroup-core-buildessential"
IMAGE_INSTALL_append += "git"
IMAGE_INSTALL_append += "cmake"
IMAGE_INSTALL_append += "rapidjson"
IMAGE_INSTALL_append += "freetype"
IMAGE_INSTALL_append += "freetype-dev"

IMAGE_INSTALL_append += "zlib zlib-dev"

# Stuff from meta-ham-and-eggs
IMAGE_INSTALL_append += "appbuild"
IMAGE_INSTALL_append += "add-developer-to-sudo"
IMAGE_INSTALL_append += "copy-repos"

IMAGE_FEATURES_append += "tools-sdk"
IMAGE_FEATURES_append += "tools-debug"
#IMAGE_FEATURES_append += "debug-tweaks"
