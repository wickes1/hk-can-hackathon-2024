import { ZodError } from 'zod';

interface GenericResponse {
  isSuccess: boolean;
  body?: any;
  errorCode?: string;
  errorMsg?: string;
  zodError?: ZodError;
}

enum GenericResponseStatus {
  SUCCESS = 'success',
  ERROR = 'error',
}

export class GenericResponseModel {
  status: string;
  body?: any;
  errorCode?: string;
  errorMsg?: string;

  constructor(obj: GenericResponse) {
    if (obj.zodError) {
      this.status = GenericResponseStatus.ERROR;
      this.errorCode = obj.zodError.errors[0]?.message;
    } else {
      this.status = obj.isSuccess ? GenericResponseStatus.SUCCESS : GenericResponseStatus.ERROR;
      this.body = obj.body;
      this.errorCode = obj.errorCode;
      this.errorMsg = obj.errorMsg;
    }
  }
}
