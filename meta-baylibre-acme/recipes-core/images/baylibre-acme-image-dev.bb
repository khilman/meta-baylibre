inherit core-image
inherit mksdcard

INC_PR = "r0"

IMAGE_FEATURES += "dev-pkgs"

DEPENDS += "linux-yocto-mainline"

FSTYPE_VIRT ?= "ext3"

IMAGE_INSTALL += "util-linux"
IMAGE_INSTALL += "util-linux-blkid"
IMAGE_INSTALL += "util-linux-mount"

IMAGE_INSTALL += "acme-utils"
IMAGE_INSTALL += "acme-iio-init"
IMAGE_INSTALL += "i2c-tools"
IMAGE_INSTALL += "libiio"

IMAGE_INSTALL += "packagegroup-swi-image-target"


IMAGE_BOOT_FILES += "zImage zImage-am335x-boneblack.dtb uEnv.txt"
