include recipes-sato/images/core-image-sato.bb

EXTRA_IMAGE_FEATURES += " ssh-server-openssh tools-sdk package-management" 

EXTRA_IMAGE_FEATURES += " tools-testapps tools-profile"

IMAGE_INSTALL_append += " htop i2c-tools packagegroup-fslc-gstreamer1.0-full"

IMAGE_INSTALL_append += " \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-gstreamer-full \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
"
#     ${@base_contains('DISTRO_FEATURES', 'directfb', 'packagegroup-core-directfb', '', d)} 

IMAGE_FSTYPES = "sdcard"

IMAGE_INSTALL += " kernel-dev"

# this reserves some extra free space on the rootfs partition
# drawback: this empty spaces makes the .sdcard image larger and copying (dd) slower
# as an alternative you might want to create a third "data" partition on the microSD card
IMAGE_ROOTFS_EXTRA_SPACE = "128000" 

IMAGE_INSTALL_append += " \
  eglinfo-fb \
"

IMAGE_INSTALL_append += " \
    qtbase-fonts \
    qtbase-plugins \
    qtbase-tools \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-tools \
    qtmultimedia \
    qtmultimedia-plugins \
    qtsvg \
    qtsvg-plugins \
    qtsensors \
    qtimageformats-plugins \
    qtsystems \
    qtsystems-tools \
    qtscript \
    qt3d \
    qt3d-tools \
"

IMAGE_INSTALL += " \
    cpufrequtils \
    nano \
    xterm \
    openbox \
    openbox-theme-clearlooks \
    gst-plugins-gl-opengl \
    coreutils \
    elfutils-dev \
    enca \
    gcc \
    libass \
    libdvdread \
    libfaad \
    fribidi \
    libgcc \
    gmp \
    libice \
    libice-dev \
    libmpc \
    mpfr \
    libsm \
    libsm-dev \
    libx11 \
    libxcalibrate \
    libxext \
    libxinerama \
    libxmu \
    libxt \
    linux-libc-headers-dev \
    make \
    mkfontdir \
    mkfontscale \
    x11-common-dev \
    xextproto-dev \
    xproto-dev \
    xserver-xorg-dev \
    xserver-xorg-multimedia-modules \
    xserver-xorg-utils \    
    icu \
    qtdeclarative-qmlplugins \
    qtmultimedia-qmlplugins \
    qtsystems-qmlplugins \
    qtwebkit-qmlplugins \
    qt3d-qmlplugins \
"

IMAGE_INSTALL_append += " \
    cinematicexperience \
    qtsmarthome \
    qt5everywheredemo \
    qtwebkit-examples-examples \
    qtserialport \
"

IMAGE_INSTALL_append = " gcc g++ binutils libgcc libgcc-dev libstdc++ libstdc++-dev libstdc++-staticdev \
dbus \
autoconf automake ccache chkconfig glib-networking glibmm \
packagegroup-core-buildessential pkgconfig  \
boost cmake zlib glib-2.0 packagegroup-fsl-tools-testapps  \
"


