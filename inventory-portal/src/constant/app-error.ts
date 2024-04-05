export class AppError {
  // Inventory Image Upload Related
  static readonly INVENTORY_IMAGE_NOT_FOUND = new AppError(
    'INVENTORY_IMAGE_NOT_FOUND',
    'Image file is required.',
  );
  static readonly INVENTORY_IMAGE_FILE_TOO_LARGE = new AppError(
    'INVENTORY_IMAGE_FILE_TOO_LARGE',
    'Image file too large.',
  );
  static readonly INVENTORY_IMAGE_WRONG_FILE_TYPE = new AppError(
    'INVENTORY_IMAGE_WRONG_FILE_TYPE',
    'Wrong image file type.',
  );

  // Global Backend Error
  static readonly INTERNAL_SERVER_ERROR = new AppError(
    'INTERNAL_SERVER_ERROR',
    'Internal Server Error.',
  );

  private constructor(
    public readonly errorCode: string,
    public readonly displayMessage: string,
  ) {}
}
