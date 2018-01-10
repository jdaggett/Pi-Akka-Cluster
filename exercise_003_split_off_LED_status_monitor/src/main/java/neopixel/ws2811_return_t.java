/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package neopixel;

public final class ws2811_return_t {
  public final static ws2811_return_t WS2811_SUCCESS = new ws2811_return_t("WS2811_SUCCESS", rpi_ws281xJNI.WS2811_SUCCESS_get());
  public final static ws2811_return_t WS2811_ERROR_GENERIC = new ws2811_return_t("WS2811_ERROR_GENERIC", rpi_ws281xJNI.WS2811_ERROR_GENERIC_get());
  public final static ws2811_return_t WS2811_ERROR_OUT_OF_MEMORY = new ws2811_return_t("WS2811_ERROR_OUT_OF_MEMORY", rpi_ws281xJNI.WS2811_ERROR_OUT_OF_MEMORY_get());
  public final static ws2811_return_t WS2811_ERROR_HW_NOT_SUPPORTED = new ws2811_return_t("WS2811_ERROR_HW_NOT_SUPPORTED", rpi_ws281xJNI.WS2811_ERROR_HW_NOT_SUPPORTED_get());
  public final static ws2811_return_t WS2811_ERROR_MEM_LOCK = new ws2811_return_t("WS2811_ERROR_MEM_LOCK", rpi_ws281xJNI.WS2811_ERROR_MEM_LOCK_get());
  public final static ws2811_return_t WS2811_ERROR_MMAP = new ws2811_return_t("WS2811_ERROR_MMAP", rpi_ws281xJNI.WS2811_ERROR_MMAP_get());
  public final static ws2811_return_t WS2811_ERROR_MAP_REGISTERS = new ws2811_return_t("WS2811_ERROR_MAP_REGISTERS", rpi_ws281xJNI.WS2811_ERROR_MAP_REGISTERS_get());
  public final static ws2811_return_t WS2811_ERROR_GPIO_INIT = new ws2811_return_t("WS2811_ERROR_GPIO_INIT", rpi_ws281xJNI.WS2811_ERROR_GPIO_INIT_get());
  public final static ws2811_return_t WS2811_ERROR_PWM_SETUP = new ws2811_return_t("WS2811_ERROR_PWM_SETUP", rpi_ws281xJNI.WS2811_ERROR_PWM_SETUP_get());
  public final static ws2811_return_t WS2811_ERROR_MAILBOX_DEVICE = new ws2811_return_t("WS2811_ERROR_MAILBOX_DEVICE", rpi_ws281xJNI.WS2811_ERROR_MAILBOX_DEVICE_get());
  public final static ws2811_return_t WS2811_ERROR_DMA = new ws2811_return_t("WS2811_ERROR_DMA", rpi_ws281xJNI.WS2811_ERROR_DMA_get());
  public final static ws2811_return_t WS2811_ERROR_ILLEGAL_GPIO = new ws2811_return_t("WS2811_ERROR_ILLEGAL_GPIO", rpi_ws281xJNI.WS2811_ERROR_ILLEGAL_GPIO_get());
  public final static ws2811_return_t WS2811_ERROR_PCM_SETUP = new ws2811_return_t("WS2811_ERROR_PCM_SETUP", rpi_ws281xJNI.WS2811_ERROR_PCM_SETUP_get());
  public final static ws2811_return_t WS2811_ERROR_SPI_SETUP = new ws2811_return_t("WS2811_ERROR_SPI_SETUP", rpi_ws281xJNI.WS2811_ERROR_SPI_SETUP_get());
  public final static ws2811_return_t WS2811_ERROR_SPI_TRANSFER = new ws2811_return_t("WS2811_ERROR_SPI_TRANSFER", rpi_ws281xJNI.WS2811_ERROR_SPI_TRANSFER_get());
  public final static ws2811_return_t WS2811_RETURN_STATE_COUNT = new ws2811_return_t("WS2811_RETURN_STATE_COUNT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ws2811_return_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ws2811_return_t.class + " with value " + swigValue);
  }

  private ws2811_return_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ws2811_return_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ws2811_return_t(String swigName, ws2811_return_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ws2811_return_t[] swigValues = { WS2811_SUCCESS, WS2811_ERROR_GENERIC, WS2811_ERROR_OUT_OF_MEMORY, WS2811_ERROR_HW_NOT_SUPPORTED, WS2811_ERROR_MEM_LOCK, WS2811_ERROR_MMAP, WS2811_ERROR_MAP_REGISTERS, WS2811_ERROR_GPIO_INIT, WS2811_ERROR_PWM_SETUP, WS2811_ERROR_MAILBOX_DEVICE, WS2811_ERROR_DMA, WS2811_ERROR_ILLEGAL_GPIO, WS2811_ERROR_PCM_SETUP, WS2811_ERROR_SPI_SETUP, WS2811_ERROR_SPI_TRANSFER, WS2811_RETURN_STATE_COUNT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

